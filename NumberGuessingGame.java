import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int attemptsLimit = 10; // predefined limit of attempts
        int attempts = 0;
        int randomNumber = random.nextInt(max - min + 1) + min;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + min + " and " + max + ".");
        System.out.println("You have " + attemptsLimit + " attempts to guess it.");

        while (attempts < attemptsLimit) {
            System.out.print("Enter your guess (between " + min + " and " + max + "): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                guessedCorrectly = true;
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        if (guessedCorrectly) {
            System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
        } else {
            System.out.println("Sorry, you did not guess the number. The correct number was " + randomNumber + ".");
        }

        scanner.close();
    }
}