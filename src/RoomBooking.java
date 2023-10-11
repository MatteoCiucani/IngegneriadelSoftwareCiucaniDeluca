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

    public int getReservationNumber() {
        return reservationNumber;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public int getDurationInDay() {
        return durationInDay;
    }

    public LocalDateTime getCheckin() {
        return checkin;
    }

    public LocalDateTime getCheckout() {
        return checkout;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setDurationInDay(int durationInDay) {
        this.durationInDay = durationInDay;
    }

    public void setCheckin(LocalDateTime checkin) {
        this.checkin = checkin;
    }

    public void setCheckout(LocalDateTime checkout) {
        this.checkout = checkout;
    }


}
