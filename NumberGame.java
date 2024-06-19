import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            final int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("I've generated a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + number + ".");
            }

            System.out.print("Would you like to play again? (yes/no): ");
            scanner.nextLine(); // Consume the newline
            playAgain = scanner.nextLine().trim().equalsIgnoreCase("yes");

        } while (playAgain);

        scanner.close();
    }
}

