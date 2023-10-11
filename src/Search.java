import java.time.LocalDateTime;
import java.util.List;
public interface Search {
    List<Room> searchRoom(RoomStyle roomStyle, LocalDateTime startDate, LocalDateTime endDate);
}
