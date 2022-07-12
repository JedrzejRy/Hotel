import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserService {

    public List<Room> downloadRoomList(Hotel hotel){
        return hotel.getRooms();
    }

    public List<Room> downloadAllAvailableRooms(Hotel hotel){
        List<Room> availableRooms = new ArrayList<>();
        for (Room c : hotel.getRooms()){
            if (c.isAvailable()){
                availableRooms.add(c);
            }
        }
        return availableRooms;
    }

    public void reserveARoom(int roomNumber, Hotel hotel){
        for (Room c : hotel.getRooms()){
            if (c.getRoomNumber() == roomNumber){
                c.setAvailable(false);
            }
        }
    }

    public void setRoomAvailable(int roomNumber, Hotel hotel){
        for (Room c : hotel.getRooms()){
            if (c.getRoomNumber() == roomNumber){
                c.setAvailable(true);
            }
        }
    }


}
