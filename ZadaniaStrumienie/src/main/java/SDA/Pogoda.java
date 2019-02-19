package SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Pogoda {

    static final Logger log = Logger.getLogger(Pogoda.class.getName());
    static final String s = Paths.get("").toAbsolutePath().toString().replace("\\","/");
    static final String resourcesPath = s+"/src/main/resources/";



    //############################ UTWORZ OBIEKT wDay NA PODSTAWIE REKORDU CSV
    public wDay setDay(String rekord) {
        // dzielimy rekord na date i temperatury
        String[] line = rekord.split(",");
        wDay dzien = new wDay(
                // w line[0], konstruktor wDay sam zamieni csv na LocalDate
                line[0],
                Integer.parseInt(line[1]),
                Integer.parseInt(line[2]),
                Integer.parseInt(line[3]));
        return dzien;
    }
    //############################  POKAZ DANE DNIA
    public void showDay(wDay day) {
        System.out.println(day.toString());
    }
    //############################ ZNAJDZ DANE Z DNIA
    public wDay findAday(String date) throws IOException {
        File weatherRaports = new File(resourcesPath + "weather-data.csv");
        LineIterator newLine = FileUtils.lineIterator(weatherRaports, "UTF-8");


        while (newLine.hasNext()) {
            String buffor = newLine.nextLine();
            String[] currentData = (buffor.split(","));

            if (currentData[0].equals(date)) {
                wDay day = setDay(buffor);
                return day;
            }
        }
        return null;
    }
    //############################ TEMP W PRZEDZIALE
    public List<Integer> tempInPeriod(String date1, String date2) throws IOException {
        //wczytanie pliku
        File weatherRaports = new File(resourcesPath + "weather-data.csv");
        LineIterator newLine = FileUtils.lineIterator(weatherRaports, "UTF-8");
        // deklaracja kluczowych pól
        List<Integer> resault = new LinkedList<>();
        List<wDay> dniWzakresie = new LinkedList<>();
        wDay day;
        boolean inScope = false;

        // tworzymy liste dni z zakresu
        while (newLine.hasNext()) {
            String buffor = newLine.nextLine();
            String[] currentData = (buffor.split(","));

            if (currentData[0].equals(date1)) {
                inScope = true;
            }
            if (inScope) {
                day = setDay(buffor);
                dniWzakresie.add(day);
            }
            if (currentData[0].equals(date2)) {
                break;
            }
        }
        // szukanie min i max temp
        int min, max;
        min = dniWzakresie.get(0).getlTemp();
        max = dniWzakresie.get(0).gethTemp();
        for (wDay x : dniWzakresie
        ) {
            if (x.gethTemp() > max) {
                max = x.gethTemp();
            }
            if (x.gethTemp() < min) {
                min = x.gethTemp();
            }
        }
        resault.add(min);
        resault.add(max);

        return resault;
    }


    //############################ TEMPERATURY POWYZEJ I PONIZEJ ZADANEJ WARTOSCI
    public List<Integer> aboveAndBelow(Integer boundry) throws IOException {

        File weatherRaports = new File(resourcesPath + "weather-data.csv");
        LineIterator newLine = FileUtils.lineIterator(weatherRaports, "UTF-8");

        List<Integer> resault = new LinkedList<>();
        List<wDay> dni = new LinkedList<>();
        wDay day;
        while (newLine.hasNext()) {
            try {

                day = setDay(newLine.nextLine());
                dni.add(day);
            } catch (Exception e) {
                log.info("zly format");
            }


        }
        int below = 0, above = 0, avarage = 0;

        for (wDay x : dni
        ) {
            if (x.getmTemp() > boundry) {
                above++;
            }
            if (x.getmTemp() < boundry) {
                below++;
            }
            avarage += x.getmTemp();
        }
        resault.add(above);
        resault.add(below);
        resault.add(avarage / dni.size());

        return resault;
    }
    //############################ NAJCIEPLEJSZY I NAJCHŁODNIEJSZY DZIEN/MIESIAC/ROK
    public void hottestColdest() throws IOException {

        File weatherRaports = new File(resourcesPath + "weather-data.csv");
        LineIterator newLine = FileUtils.lineIterator(weatherRaports, "UTF-8");

        List<Integer> resault = new LinkedList<>();
        List<wDay> dni = new LinkedList<>();
        wDay day;

        while (newLine.hasNext()) {
            try {
                day = setDay(newLine.nextLine());
                dni.add(day);
            } catch (Exception e) {
                log.info("zly format");
            }
        }
        Collections.sort(dni);
        Integer[][] hcDay = hottestAndColdestDay(dni);
        Integer[][] hcMonth = hottestAndColdestMonth(dni);
        Integer[][] hcYear = hottestAndColdestYear(dni);



        System.out.println(
                "\ncoldest Year: "  +hcYear[0][0]+" with "+ hcYear[0][1]+"degree"+
                "\nhottest Year: " +hcYear[1][0]+" with "+ hcYear[1][1]+"degree"+
                "\ncoldest month: "+hcMonth[0][0]+" with "+ hcMonth[0][1]+"degree"+
                "\nhottest month: "+hcMonth[1][0]+" with "+ hcMonth[1][1]+"degree"+
                "\ncoldest day: "  +hcDay[0][0]+" with "+ hcDay[0][1]+"degree"+
                "\nhottest day: "  +hcDay[1][0]+" with "+ hcDay[1][1]+"degree");
    }

    public Integer[][] eachDayAvTemp(List<wDay> dni){
        Integer[][] avDailyTemp = new Integer[31][2];
        for (Integer[] x: avDailyTemp
        ) { x[0] = x[1] = 0; }

        for (wDay day: dni
        ) {
            // setting int counter, to store information about dayOfMonth
            int currentDay = (Integer)day.getDzien().getDayOfMonth();
            // summing all temperatures in a field corresponding to calendar date
            avDailyTemp[currentDay-1][0]+= day.getmTemp();
            // counting total ammount of days
            avDailyTemp[currentDay-1][1]++;
        }
        // getting avarage daily temp for each day
        for (Integer[] x: avDailyTemp
        ) {
            x[0]=x[0]/x[1];
        }

        return avDailyTemp;
    }

    public Integer[][] eachMonthAvTemp(List<wDay> dni) {

        Integer[][] avarageTempMatrix = new Integer[12][2];

        for (Integer[] x : avarageTempMatrix
        ) {
            x[0] = x[1] = 0;
        }

        for (wDay day : dni
        ) {
            int current = day.getDzien().getMonthValue();
            avarageTempMatrix[current - 1][0] += day.getmTemp();
            avarageTempMatrix[current - 1][1]++;
        }
        for (Integer[] x : avarageTempMatrix
        ) {
            x[0] = x[0] / x[1];
        }

        return avarageTempMatrix;
    }

    public Integer countYears(List<wDay> dni) {
        // liste sprawdzamy rok po roku z uwagi na to, że dane moga byc nie kompletne.
        int years = 1;
        for (int i = 0; i < dni.size() - 1; i++) {
            if (dni.get(i).getDzien().getYear() < dni.get(i + 1).getDzien().getYear()) {
                years++;
            }
        }
        return years;
    }
    
    public Integer[][] eachYearAvTemp(List<wDay> dni) {
        Map<Integer, Integer> years = new HashMap<>();
        int avTemp = 0;

        for (int i = 0; i < dni.size() - 1; i++) {
            avTemp += dni.get(i).getmTemp();
            if (dni.get(i).getDzien().getYear() < dni.get(i + 1).getDzien().getYear()) {
                avTemp = avTemp / dni.get(i).getDzien().getDayOfYear();
                years.put(dni.get(i).getDzien().getYear(), avTemp);
                avTemp=0;
            }
        }
        Integer[][] resault = new Integer[2][2];
        int high = Collections.max(years.values());
        int low = Collections.min(years.values());

        for (Integer x: years.keySet()
             ) {
            if(years.get(x).equals(high)){
                resault[1][0]=x;
                resault[1][1]=years.get(x);

            }
            if(years.get(x).equals(low)){
                resault[0][0]=x;
                resault[0][1]=years.get(x);

            }
        }

        return resault;
    }
    public Integer[][] lowestHighestInScope(Integer[][] valueAndIndex){
        Integer[][] avDailyTemp = valueAndIndex;

        int hotIndex = 0;
        int coldIndex = 0;
        int lowestTemp = avDailyTemp[1][0];
        int highestTemp = avDailyTemp[1][0];

        for (int i = 0; i < avDailyTemp.length - 1; i++) {
            if (avDailyTemp[i][0] > highestTemp) {
                highestTemp = avDailyTemp[i][0];
                hotIndex = i;
            }
            if (avDailyTemp[i][0] < avDailyTemp[i + 1][0]) {
                if (avDailyTemp[i][0] < lowestTemp) {
                    lowestTemp = avDailyTemp[i][0];
                    coldIndex = i;
                }
            }
        }

        Integer[][] resault = new Integer[2][2];

        resault[0][0] = coldIndex + 1;
        resault[0][1] = lowestTemp;
        resault[1][0] = hotIndex + 1;
        resault[1][1] = highestTemp;

        return resault;

    }


    public Integer[][] hottestAndColdestDay(List<wDay> dni){
       Integer[][] avDailyTemp = eachDayAvTemp(dni);
       return  lowestHighestInScope(avDailyTemp);
    }
    public Integer[][] hottestAndColdestMonth(List<wDay> dni){
        Integer[][] avDailyTemp = eachMonthAvTemp(dni);
        return  lowestHighestInScope(avDailyTemp);
    }
    public Integer[][] hottestAndColdestYear(List<wDay> dni){

        return eachYearAvTemp(dni);
    }








}