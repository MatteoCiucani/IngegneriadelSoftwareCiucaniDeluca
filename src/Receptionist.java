import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Receptionist extends Person implements Search{
    private List<Room> rooms;
    public Receptionist(String name, String address, String email, int phone, String gender, AccountType accountType) {
        super(name, address, email, phone, gender, accountType);
    }

    @Override
    public List<Room> searchRoom(RoomStyle roomStyle, LocalDateTime startdate, int duration) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            // Verifica se la camera è disponibile in base allo stile e alla data
            if (room.getRoomStyle() == roomStyle /*&& isRoomAvailable(room, startdate, duration)*/) {
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }




}
