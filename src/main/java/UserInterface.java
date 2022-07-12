import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    public void userInterface() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        UserService userService = new UserService();
        int input;

        do {
            System.out.println("\n\n          Hotel Menu");
            System.out.println("--------------------------------------");
            System.out.println("1 - Display all rooms");
            System.out.println("2 - Display all available rooms");
            System.out.println("3 - Reserve a room");
            System.out.println("4 - Set room as available");
            System.out.println("9 - Quit");
            System.out.print("\nSelect a Menu Option: ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println(userService.downloadRoomList(hotel));
                    break;
                case 2:
                    System.out.println(userService.downloadAllAvailableRooms(hotel));
                    break;
                case 3:
                    System.out.println("Please type room number: ");
                    int number = scanner.nextInt();
                    userService.reserveARoom(number, hotel);
                    break;
                case 4:
                    System.out.println("Please type room number: ");
                    number = scanner.nextInt();
                    userService.setRoomAvailable(number, hotel);
                    break;
                case 9:
                    return;
            }
        }
        while (true);
    }
}
