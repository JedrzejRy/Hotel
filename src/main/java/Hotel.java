import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> rooms = new ArrayList<>();

    public Hotel() {
        Room room0 = new Room(10,2,true,true);
        Room room1 = new Room(11,3,true,true);
        Room room2 = new Room(12,1,true,true);
        Room room3 = new Room(13,4,true,true);
        Room room4 = new Room(14,2,true,true);
        Room room5 = new Room(15,2,true,true);
        rooms = List.of(room0,room1,room2,room3,room4,room5);
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
