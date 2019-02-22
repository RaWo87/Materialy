package SDA.Pogoda;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Month;
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

        while (newLine.hasNext()) {
            try {
                wDay day = setDay(newLine.nextLine());
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

        System.out.println(eachYearAvTemp(dni).keySet());
        System.out.println(eachYearAvTemp(dni).values());

        System.out.println(eachMonthAvTemp(dni).keySet());
        System.out.println(eachMonthAvTemp(dni).values());

        System.out.println(eachDayAvTemp(dni).keySet());
        System.out.println(eachDayAvTemp(dni).values());

    }

    public Map<Integer, Double> eachDayAvTemp(List<wDay> dni) {
        Map<Integer, Double> tempInDays = new HashMap<>();
        Map<Integer, Integer> daysInDays = new HashMap<>();

        Double sumaTemperatur;
        int liczbaDni;
        for (wDay day : dni
        ) {
            if (!tempInDays.containsKey(day.getDzien().getDayOfMonth())) {
                sumaTemperatur = Double.valueOf(day.getmTemp());
                liczbaDni = 1;
            } else {
                sumaTemperatur = day.getmTemp() + tempInDays.get(day.getDzien().getDayOfMonth());
                liczbaDni = daysInDays.get(day.getDzien().getDayOfMonth()) + 1;
            }
            tempInDays.put(day.getDzien().getDayOfMonth(), sumaTemperatur);
            daysInDays.put(day.getDzien().getDayOfMonth(), liczbaDni);
        }

        for (Integer day : tempInDays.keySet()
        ) {
            tempInDays.put(day, tempInDays.get(day) / daysInDays.get(day));
        }

        Double high = Collections.max(tempInDays.values());
        Double low = Collections.min(tempInDays.values());


        //transfering outcome to resaults Map
        Map<Integer, Double> resault = new HashMap<>();
        for (Integer x : tempInDays.keySet()
        ) {
            if (tempInDays.get(x).equals(high)) {
                resault.put(x, high);
            }
            if (tempInDays.get(x).equals(low)) {
                resault.put(x, low);
            }
        }
        return resault;
    }

    public Map<Month, Integer> eachMonthAvTemp(List<wDay> dni) {
        Map<Month, Integer> tempInMonths = new HashMap<>();
        Map<Month, Integer> daysInMonths = new HashMap<>();
        // Setting keySets
        for (Month x : Month.values()
        ) {
            tempInMonths.put(x, 0);
            daysInMonths.put(x, 0);
        }
        // summing temperatures for each month, and ammount of days for given months
        for (wDay day : dni
        ) {
            int sumaTemperatur = tempInMonths.get(day.getDzien().getMonth());
            sumaTemperatur += day.getmTemp();
            tempInMonths.put(day.getDzien().getMonth(), sumaTemperatur);

            int dayCounter = daysInMonths.get(day.getDzien().getMonth());
            dayCounter++;
            daysInMonths.put(day.getDzien().getMonth(), dayCounter);

        }
        // Calculating an avarage monthly temperature
        for (Month x : tempInMonths.keySet()
        ) {
            int avarageTemp = tempInMonths.get(x) / daysInMonths.get(x);
            tempInMonths.put(x, avarageTemp);
        }
        // Looking for min and max values
        int high = Collections.max(tempInMonths.values());
        int low = Collections.min(tempInMonths.values());

        //transfering outcome to resaults Map
        Map<Month, Integer> resault = new HashMap<>();
        for (Month x : tempInMonths.keySet()
        ) {
            if (tempInMonths.get(x).equals(high)) {
                resault.put(x, high);
            }
            if (tempInMonths.get(x).equals(low)) {
                resault.put(x, low);
            }
        }
        return resault;
    }


    public Map<Integer, Double> eachYearAvTemp(List<wDay> dni) {
        Map<Integer, Double> years = new HashMap<>();
        Double avTemp = 0D;

        for (int i = 0; i < dni.size() - 1; i++) {
            avTemp += dni.get(i).getmTemp();
            if (dni.get(i).getDzien().getYear() < dni.get(i + 1).getDzien().getYear()) {
                avTemp = avTemp / dni.get(i).getDzien().getDayOfYear();
                years.put(dni.get(i).getDzien().getYear(), avTemp);
                avTemp = 0D;
            }
        }
        Double high = Collections.max(years.values());
        Double low = Collections.min(years.values());

        //transfering outcome to resaults Map
        Map<Integer, Double> resault = new HashMap<>();
        for (Integer x : years.keySet()
        ) {
            if (years.get(x).equals(high)) {
                resault.put(x, high);
            }
            if (years.get(x).equals(low)) {
                resault.put(x, low);
            }
        }
        return resault;
    }

    //############################### ZOMBIE CODE
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
}