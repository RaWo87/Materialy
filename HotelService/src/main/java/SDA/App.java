package SDA;

import SDA.Service.HotelService;
import SDA.model.Guest;
import SDA.model.Hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Hotel sdaHotel = new Hotel();
        HotelService sdaService = new HotelService(sdaHotel);
        System.out.println(sdaService.getALLRooms());
        System.out.println(sdaService.getAvailableRooms());
        sdaService.bookRoom(2);
        System.out.println(sdaService.getAvailableRooms());
        sdaService.makeAvailable(2);
        System.out.println(sdaService.getAvailableRooms());

        Guest andzej = new Guest("andzej","nowak", LocalDate.of(1987,10,22));
        Guest ania = new Guest("ania","nowak", LocalDate.of(1999,5,22));
        Guest karolinka = new Guest("karolinka","kowalska", LocalDate.of(2010,10,22));

        List<Guest> goscie = new ArrayList<>();

        goscie.add(andzej);
        goscie.add(ania);
        goscie.add(karolinka);

        sdaService.addGuests(2,goscie);

        System.out.println();
        for (Guest g:sdaService.findRoom(2).guestLiat()
             ) {
            System.out.println(g.getName());
        }

    }
}
