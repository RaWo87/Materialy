package SDA.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNr;
    private int guestsCapacity;
    private boolean bathroom;
    private boolean available;
    private boolean balcony;
    private List<Guest> roomGuests = new ArrayList<>();

    public Room(int roomNr,
                int guestsCapacity,
                boolean bathroom,
                boolean available,
                boolean balcony) {

        this.roomNr = roomNr;
        this.guestsCapacity = guestsCapacity;
        this.bathroom = bathroom;
        this.available = available;
        this.balcony = balcony;
    }
    public boolean isAvailable(){
        return this.available;
    }
    public void setAvailable(boolean a){ this.available=a;}

    public int getRoomNr(){return this.roomNr;}
    public int getGuestsCapacity(){return this.guestsCapacity;}

    public void addGuest(Guest guest){roomGuests.add(guest);}
    public void removeGuest(Guest guest){roomGuests.remove(guest);}
    public List<Guest> guestLiat(){return  roomGuests;}

    @Override
    public String toString() {
        return "Room{" +
                "roomNr=" + roomNr +
                ", available=" + available +
                '}';
    }
}
