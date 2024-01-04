import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;

    public UserInterface() {
        scanner = new Scanner(System.in);
    }

    public String getInputFromUser() {
        String input;

        while (true) {
            System.out.print("Please enter the number of the habitat you would like to view:");
            try{
                input = scanner.next();
                if(input.equals("exit")) {
                    break;
                }
                if(Animals.getAnimalByIndexInput(input) != null) {
                    break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return input;

    }

    public void switchGivenHabitat(String input) {
        Animals animal = Animals.getAnimalByIndexInput(input);
        String videoAndMessage = "";
        String name = "";
        if (animal != null) {
            videoAndMessage = animal.getVideoAndMessage();
            name = animal.getName();
        }

        String output = """
                Switching on the camera in the %s habitat...
                %s
                """;
        System.out.printf(output, name, videoAndMessage);
    }


    public void closeUserInterface() {
        System.out.println("See you later!");
        scanner.close();
    }

}
