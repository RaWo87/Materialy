package SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Pogoda {
    static final Logger log = Logger.getLogger(Pogoda.class.getName());
    String resourcesPath = "C:/Users/m1rage/IdeaProjects/ZadaniaStrumienie/src/main/resources/";

    public void loadCSV() throws IOException {
        File weatherRaports = new File(resourcesPath + "weather-data.csv");
        LineIterator newLine = FileUtils.lineIterator(weatherRaports, "UTF-8");

        String[] currentData;
        while (newLine.hasNext()) {
            currentData = newLine.nextLine().split(",");


        }

    }

    public wDay setDay(String buffor) {
        String[] line = buffor.split(",");
        wDay dzien = new wDay(
                line[0],
                Integer.parseInt(line[1]),
                Integer.parseInt(line[2]),
                Integer.parseInt(line[3]));
        return dzien;
    }

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

    public void showDay(wDay day) {
        System.out.println(day.toString());
    }

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
        int     hDay=dni.get(0).getmTemp(),
                cDay=dni.get(0).getmTemp();
        int hMonth,cMonth,hYear,cYear;
        for (wDay x: dni
             ) {
        if(x.getmTemp()>hDay){

        }
        }


        System.out.println(
                "\nhottest Year: "  +""+
                "\n coldest Year: " +""+
                "\n hottest month: "+""+
                "\n coldest month: "+""+
                "\nhottest day: "   +""+
                "\ncoldest day: "   +"");
    }








}