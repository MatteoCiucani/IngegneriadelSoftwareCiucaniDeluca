import java.time.LocalDateTime;
public class RoomBooking {
    private int reservationNumber;
    private LocalDateTime startDate;
    private int durationInDay;
    private LocalDateTime checkin;
    private LocalDateTime checkout;
    public RoomBooking(int reservationNumber, LocalDateTime startDate, int durationInDay, LocalDateTime checkin, LocalDateTime checkout) {
        this.reservationNumber = reservationNumber;
        this.startDate = startDate;
        this.durationInDay = durationInDay;
        this.checkin = checkin;
        this.checkout = checkout;
    }



}
