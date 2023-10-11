import java.time.LocalDateTime;
public class Notification {
    public Notification(int notificationId, LocalDateTime createdOn, String content) {
        this.notificationId = notificationId;
        this.createdOn = createdOn;
        this.content = content;
    }

    private int notificationId;
    private LocalDateTime createdOn;
    private String content;

}
