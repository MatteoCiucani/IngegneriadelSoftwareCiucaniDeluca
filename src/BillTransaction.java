import java.time.LocalDateTime;
public class BillTransaction {
    public BillTransaction(LocalDateTime creationDate, double amount) {
        this.creationDate = creationDate;
        this.amount = amount;
    }

    private LocalDateTime creationDate;
    private double amount;
}
