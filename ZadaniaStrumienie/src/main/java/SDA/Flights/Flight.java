package SDA.Flights;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class Flight implements Comparable<Flight> {
    private YearMonth date;
    private Integer passengers;

    public Flight(Integer year, Month month, Integer passengers) {
        this.date = YearMonth.of(year,month);
        this.passengers = passengers;
    }

    public YearMonth getDate() {
        return date;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "date=" + date +
                ", passengers=" + passengers +
                '}';
    }



    @Override
    public int compareTo(Flight o) {
        return this.date.compareTo(o.date);
    }
}
