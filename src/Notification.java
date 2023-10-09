import java.time.LocalTime;
public class Notification {
    public Notification(int notificationId, LocalTime createdOn, String content) {
        this.notificationId = notificationId;
        this.createdOn = createdOn;
        this.content = content;
    }

    private int notificationId;
    private LocalTime createdOn;
    private String content;

}
