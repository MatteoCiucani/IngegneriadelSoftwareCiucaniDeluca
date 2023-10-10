public class Room {
    private int roomNumber;
    private RoomStyle roomStyle;
    private RoomStatus roomStatus;
    private double bookingPrice;

    public Room(int roomNumber, RoomStyle roomStyle, RoomStatus roomStatus, double bookingPrice) {
        this.roomNumber = roomNumber;
        this.roomStyle = roomStyle;
        this.roomStatus = roomStatus;
        this.bookingPrice = bookingPrice;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(){
        this.roomNumber = roomNumber;
    }

    public RoomStyle getRoomStyle(){
        return roomStyle;
    }

    public void setRoomStyle() {
        this.roomStyle = roomStyle;
    }

    public RoomStatus getRoomStatus(){
        return roomStatus;
    }
    public void setRoomStatus(){
        this.roomStatus = roomStatus;
    }

    public double getBookingPrice(){
        return bookingPrice;
    }

    public void setBookingPrice(double bookingPrice) {
        this.bookingPrice = bookingPrice;
    }
}
