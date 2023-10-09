import java.time.LocalTime;
public class RoomHouseKeeper {
    public RoomHouseKeeper(String description, LocalTime startDateTime, int duration) {
        this.description = description;
        this.startDateTime = startDateTime;
        this.duration = duration;
    }

    private String description;
    private LocalTime startDateTime;
    private int duration;

}
