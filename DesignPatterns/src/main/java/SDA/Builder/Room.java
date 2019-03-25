package SDA.Builder;

public class Room {
    private int roomNr;
    private int bedCount;
    private boolean available;
    private boolean isClean;
    private boolean hasBathroom;
    private int roomArea;

    @Override
    public String toString() {
        return "Room{" +
                "roomNr=" + roomNr +
                ", bedCount=" + bedCount +
                ", available=" + available +
                ", isClean=" + isClean +
                ", hasBathroom=" + hasBathroom +
                ", roomArea=" + roomArea +
                '}';
    }



    public static  class RoomBuilder{
        private int roomNr;
        private int bedCount;
        private boolean available;
        private boolean isClean;
        private boolean hasBathroom;
        private int roomArea;

        public RoomBuilder(int roomNr, int roomArea){
            this.roomNr = roomNr;
            this.roomArea = roomArea;
        }

        public RoomBuilder bedCount(int bedCount){
            this.bedCount = bedCount;
            return this;
        }public RoomBuilder available(boolean available){
            this.available = available;
            return this;
        }public RoomBuilder roomisCleanNr(boolean isClean){
            this.isClean = isClean;
            return this;
        }public RoomBuilder hasBathroom(boolean hasBathroom){
            this.hasBathroom = hasBathroom;
            return this;
        }
        public Room build(){
            return new Room(this);
        }
    }

    private Room(RoomBuilder builder){
        roomNr = builder.roomNr;
        bedCount = builder.bedCount;
        available = builder.available;
        isClean = builder.isClean;
        hasBathroom = builder.hasBathroom;
        roomArea = builder.roomArea;
    }










}
