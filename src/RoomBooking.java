import java.time.LocalTime;
public class RoomBooking {
    public RoomBooking(int reservationNumber, LocalTime startDate, int durationInDay, LocalTime checkin, LocalTime checkout) {
        this.reservationNumber = reservationNumber;
        this.startDate = startDate;
        this.durationInDay = durationInDay;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    private int reservationNumber;
    private LocalTime startDate;
    private int durationInDay;
    private LocalTime checkin;
    private LocalTime checkout;

}
