public class Main {

    private static UserInterface userInterface;

    public static void main(String[] args) {

        start();
        processRequest();


    }

    public static void start() {
        userInterface = new UserInterface();
    }

    public static void processRequest() {
        while(true) {
            String input = userInterface.getInputFromUser();
            if(input.equals("exit")) {
                userInterface.closeUserInterface();
                break;
            }
            userInterface.switchGivenHabitat(input);
        }
    }
}