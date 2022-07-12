public class Room {
    private int roomNumber;
    private int capacity;
    private boolean isBathroom;
    private boolean isAvailable;

    public Room(int roomNumber, int capacity, boolean isBathroom, boolean isAvailable) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.isBathroom = isBathroom;
        this.isAvailable = isAvailable;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
