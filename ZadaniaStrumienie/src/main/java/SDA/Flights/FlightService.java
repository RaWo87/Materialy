package SDA.Flights;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.*;
import java.time.Month;
import java.util.*;

public class FlightService {
    static final Logger log = Logger.getLogger(FlightService.class.getName());

    private void clearLog() throws IOException {
        FileUtils.write(new File("./src/main/resources/StrumienieLogs.log"), "", "UTF-8");
    }
    // Wszystkie informacje potrzebne do wygenerowania raportu przechowuje w polach prywatnych
    // późniejsze odwoływanie się do metod, które odwołują się do metod, które odowłuja się do obiektów
    // jest absolutnie nie czytelne. Dzieki takiemu zabiegowi wszystkie dane są dostępny przy użyciu jednego odwołania
    // po czym czyścimy wszystko aby nasz program nie przechowywał niepotrzebnych infromacji;

    private List<Flight> listOfFlights = new LinkedList<>();
    private TreeMap<Integer,Integer> dataBaseYearlyGrowth = new TreeMap<>();
    private TreeMap<Month,Integer> dataBaseBestWorstMonths = new TreeMap<>();
    private TreeMap<Integer,Integer> dataBaseBestWorstYears = new TreeMap<>();
    private TreeMap<Month,Integer> dataBasePassengerPerMonth = new TreeMap<>();
    private TreeMap<Integer,Integer> dataBasePassengerPerYear = new TreeMap<>();

    private void updateDataBase(){
        dataBaseYearlyGrowth.putAll(growthByYear(passengersPerYear(listOfFlights)));
        dataBaseBestWorstMonths.putAll(bestWorstMonth(passengersPerMonth(listOfFlights)));
        dataBaseBestWorstYears.putAll(bestWorstYear(passengersPerYear(listOfFlights)));
        dataBasePassengerPerMonth.putAll(passengersPerMonth(listOfFlights));
        dataBasePassengerPerYear.putAll(passengersPerYear(listOfFlights));
    }
    public void clearDataBase(){
        dataBaseBestWorstMonths.clear();
        dataBaseBestWorstYears.clear();
        dataBasePassengerPerMonth.clear();
        dataBasePassengerPerYear.clear();
        dataBaseYearlyGrowth.clear();
        listOfFlights.clear();
    }
    // Głowna metoda odpowiedzialna za tworzenie raportu.
    public void generateRaport()throws IOException{
        try {
            readFile();
            updateDataBase();
            saveRaport();
            clearDataBase();
        }catch (Exception e){
            log.fatal("failed to create raport");
        }
        log.info("raport created");
    }

    // Czytamy plik CSV i tworzymy na jego podstawie listę obiektów na których będziemy pracować
    private void readFile() throws IOException {
        clearLog();
        File flightsCSV = new File("./src/main/resources/flights.csv");
        LineIterator liniaTekstu = FileUtils.lineIterator(flightsCSV, "UTF-8");

        while(liniaTekstu.hasNext()){
            try{
                String[] buffor = liniaTekstu.nextLine().split(",");
                log.info(buffor[0]+" "+buffor[1]+" "+buffor[2]+" ");
                listOfFlights.add(
                        new Flight(
                                Integer.valueOf(buffor[0]),
                                Month.valueOf(buffor[1].toUpperCase()),
                                Integer.valueOf(buffor[2])
                        )
                );
                log.info("flight added");
            }catch(Exception e){
                log.error("failed to read line");
            }
        }
    }
    // To można było rozbić na pojedyńcze metody zwracające String, ale wydaje mi się, że więcej
    // szkody niż pożytku by z tego wyniknęło
    private void saveRaport()throws IOException{
        File raport = new File("./src/main/resources/raport.txt");
        FileWriter pisarz = new FileWriter(raport);
        BufferedWriter writeLine = new BufferedWriter(pisarz);
        try{
            // Ilu pasarzerow przewiozła firma od założenia
            writeLine.write("\nprzez "+passengersPerYear(listOfFlights).size()
                    +" lat działalności"
                    +" Przewoźnik przewiózł "
                    + totalPassengers(listOfFlights)
                    +" pasażerów");

            // Pasażerowie rocznie
            writeLine.write("\nLiczba pasażerów rocznie: ");
            for (Integer year: dataBasePassengerPerYear.keySet()) {
                writeLine.write("\n"
                        +year+"r : "
                        +dataBasePassengerPerYear.get(year)
                        +" pasażerów");
            }

            // Pasażerowie miesięcznie
            writeLine.write("\n\nLiczba pasażerów dla każdego miesiąca: ");
            for (Month month: dataBasePassengerPerMonth.keySet()){
                writeLine.write("\n"
                                +month.toString()
                                + " "
                                + dataBasePassengerPerMonth.get(month)
                                + " pasażerów."
                );
            }
            // Najlepszy i najgorszy rok
            writeLine.write("\n\nNajlepszy i najgorszy rok działalności: ");
            Integer difference=0;
           for(Integer year :dataBaseBestWorstYears.keySet()){
               writeLine.write("\n"
                       +year
                       +"r "
                       +dataBaseBestWorstYears.get(year)
                       +" pasażerów");

                // Obliczanie różnicy
               if(dataBaseBestWorstYears.get(year)> difference){
                   difference=(dataBaseBestWorstYears.get(year))-difference;
               }else difference-=(dataBaseBestWorstYears.get(year));

           }
            writeLine.write("\nróżnica: " +difference+" pasażerów");

           // Najlepszy i najgorszy miesiąć
            writeLine.write("\n\nNajlepszy i najgorszy miesiąc działalności: ");
             difference=0;
            for(Month month :dataBaseBestWorstMonths.keySet()){
                writeLine.write("\n"
                        +month.toString()
                        +" "
                        +dataBaseBestWorstMonths.get(month)
                        +" pasażerów");

                // różnica w liczbie pasażerów, jako, że TreeMapa jest posortowana wedle miesięcy,
                // musimy dać warunek sprawdzający która z wartości jest wieksza,
                // w przeciwnym wypadku wynik mógłby być ujemny
                if(dataBaseBestWorstMonths.get(month)> difference){
                    difference=(dataBaseBestWorstMonths.get(month))-difference;
                }else difference-=(dataBaseBestWorstMonths.get(month));
            }
            writeLine.write("\nróżnica: " +difference+" pasażerów");

            // Roczny przyrosc
            writeLine.write("\n\nRoczny wzrost: ");
            for (Integer year: dataBaseYearlyGrowth.keySet()
                 ) {
                writeLine.write("\n"
                        + year+"r "
                        + dataBaseYearlyGrowth.get(year)
                        + " %");
            }
            log.info("raport saved");
        }catch (Exception e){
            System.out.println("failed to write a file");
        }finally {
            writeLine.close();
        }


    }

    // Całkowita liczba pasażerów
    private Integer totalPassengers(List<Flight> loty){
        Integer passengers=0;
        for (Flight lot: loty
             ) {
            passengers+=lot.getPassengers();
        }
        return passengers;
    }
    // Pasażerowie wedle lat, korzystam z TreeMapy aby móc już przy pierwszej iteracji
    // mieć wszystkich pasażerów uszeregowanych latami, niżej postępuje analogicznie dla miesięcy,
    // mógłbym utworzyć obie mapy podczas jednego sortowania, albo od razu modyfikować pola #dataBase
    // co zmniejszyło by stopień złożoności z 2n do n, ale wydaje mi się, że
    // kod stracił by wtedy na czytelnośc, uniwersalności i trudniej było by go testować
    // wieć postawiłem na pojedyńczą odpowiedzialność
    private TreeMap<Integer,Integer> passengersPerYear(List<Flight> loty){
        TreeMap<Integer,Integer> resault = new TreeMap<>();

        for (Flight lot : loty
        ) {
            if (resault.containsKey(lot.getDate().getYear())) {
                Integer passengers = resault.get(lot.getDate().getYear());
                passengers += lot.getPassengers();
                resault.put(lot.getDate().getYear(), passengers);
            } else {
                resault.put(lot.getDate().getYear(), lot.getPassengers());
            }
        }
        return resault;
    }

    private TreeMap<Month,Integer> passengersPerMonth(List<Flight> loty){
        TreeMap<Month,Integer> resault = new TreeMap<>();

        for (Flight lot : loty
        ) {
            if (resault.containsKey(lot.getDate().getMonth())) {
                Integer passengers = resault.get(lot.getDate().getMonth());
                passengers += lot.getPassengers();
                resault.put(lot.getDate().getMonth(), passengers);
            } else {
                resault.put(lot.getDate().getMonth(), lot.getPassengers());
            }
        }
        return resault;
    }
    // korzystam z klasy kolekcji aby w prosty sposób określić min i max wartość.
    // wydaje mi się, że można by obejść się bez iteracji aby uzyskać oczekiwany wynik,
    // ale nie bardzo wiem jakiej metody można by urzyć w zamian
    private TreeMap<Integer,Integer> bestWorstYear(Map<Integer,Integer> passengersByYears){
        TreeMap<Integer,Integer> resault = new TreeMap<>();

        Integer max = Collections.max(passengersByYears.values());
        Integer min = Collections.min(passengersByYears.values());

        for (Integer year: passengersByYears.keySet()
             ) {
            if(passengersByYears.get(year).equals(max)){
                resault.put(year,max);
            }
            if(passengersByYears.get(year).equals(min)){
                resault.put(year,min);
            }
        }
        return resault;
    }
    private TreeMap<Month,Integer> bestWorstMonth(Map<Month,Integer> passengersByMonths){
        TreeMap<Month,Integer> resault = new TreeMap<>();

        Integer max = Collections.max(passengersByMonths.values());
        Integer min = Collections.min(passengersByMonths.values());

        for (Month month: passengersByMonths.keySet()
        ) {
            if(passengersByMonths.get(month).equals(max)){
                resault.put(month,max);
            }
            if(passengersByMonths.get(month).equals(min)){
                resault.put(month,min);
            }
        }
        return resault;
    }

    private TreeMap<Integer,Integer> growthByYear(TreeMap<Integer,Integer> passengersPerYear){

        TreeMap<Integer, Integer> resault = new TreeMap<>();
        for (Integer key : passengersPerYear.keySet()
        ) {
            Integer lowerKey = passengersPerYear.lowerKey(key);
            if (lowerKey != null) {
                Integer growth = (passengersPerYear.get(key) * 100) / passengersPerYear.get(lowerKey);
                growth -= 100;
                resault.put(key, growth);
            }

        }
        return resault;
    }

}
