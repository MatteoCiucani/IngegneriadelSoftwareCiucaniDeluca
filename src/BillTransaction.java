import java.time.LocalTime;
public class BillTransaction {
    public BillTransaction(LocalTime creationDate, double amount) {
        this.creationDate = creationDate;
        this.amount = amount;
    }

    private LocalTime creationDate;
    private double amount;
}
