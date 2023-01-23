import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        // create instance of Random class.
        Random randomNum = new Random();
        int computerNumber = randomNum.nextInt(100);
        //System.out.println("Chosen number is " + computerNumber);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your number (1-100) ");
            String playerInput = scanner.next();

            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                int playerNumber = Integer.parseInt(playerInput);

                if (playerNumber == computerNumber) {
                    String ANSI_CYAN = "\u001B[36m";
                    System.out.println(ANSI_CYAN + "You guessed it!");
                    break;
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too HIgh");
                } else if (playerNumber < computerNumber) {
                    System.out.println("Too Low");
                } else {
                    System.out.println("Invalid input.");
                }
            }

        }
    }
}
