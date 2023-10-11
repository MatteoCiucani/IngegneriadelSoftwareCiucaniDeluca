import java.time.LocalDateTime;
public class RoomHouseKeeper {
    public RoomHouseKeeper(String description, LocalDateTime startDateTime, int duration) {
        this.description = description;
        this.startDateTime = startDateTime;
        this.duration = duration;
    }

    private String description;
    private LocalDateTime startDateTime;
    private int duration;

}
