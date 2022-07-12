import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean run;

      UserInterface userInterface = new UserInterface();

       do {
           try {
               userInterface.userInterface();
               run = false;
           } catch (InputMismatchException e) {
               System.out.println("Please select correct number");
               run = true;
           }
       }while (run);

    }

}
