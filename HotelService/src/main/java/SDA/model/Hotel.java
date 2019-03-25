package SDA.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> hotelRooms = new ArrayList<>();

public Hotel(){

    hotelRooms.add(new Room(1,2,true,false,true));
    hotelRooms.add(new Room(2,4,true,true,false));
    hotelRooms.add(new Room(3,0,false,true,true));
    hotelRooms.add(new Room(4,5,true,false,false));
    hotelRooms.add(new Room(5,1,true,true,true));
    hotelRooms.add(new Room(5,4,true,false,true));
    hotelRooms.add(new Room(6,1,false,true,false));
    hotelRooms.add(new Room(7,3,true,false,true));
    hotelRooms.add(new Room(0,3,false,true,true));
    hotelRooms.add(new Room(9,2,true,false,true));
}

public List<Room>getHotelRooms(){
    return hotelRooms;
}







}
