package SDA;

import SDA.Flights.FlightService;
import SDA.Pogoda.Pogoda;

import java.io.IOException;
import java.time.Month;

public class TesterStrumieni {


    public static void main(String[] args) throws IOException {
        Strumienie a = new Strumienie();
        Pogoda w = new Pogoda();
        FlightService loty = new FlightService();
        loty.generateRaport();







    }
}
