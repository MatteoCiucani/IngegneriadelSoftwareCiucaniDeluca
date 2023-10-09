public class Room {
    public Room(int roomNumber, RoomStyle roomStyle, RoomStatus roomStatus, double bookingPrice) {
        this.roomNumber = roomNumber;
        this.roomStyle = roomStyle;
        this.roomStatus = roomStatus;
        this.bookingPrice = bookingPrice;
    }

    private int roomNumber;
    private RoomStyle roomStyle;
    private RoomStatus roomStatus;
    private double bookingPrice;
}
