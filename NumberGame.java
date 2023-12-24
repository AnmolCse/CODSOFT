import java.util.Random;
import java.util.Scanner;

public class NumberGame 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        boolean playAgain = true;

        while (playAgain) 
        {
            playGame(scanner, r);

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();

            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing!");
    }

    private static void playGame(Scanner scanner, Random r) {
        int generatedNumber = r.nextInt(100) + 1;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        while (!guessedCorrectly) 
        {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
          if(attempts<11)
          {
            if (guess == generatedNumber) 
            {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                System.out.println("Your score is : " + (attempts*100));
                System.out.println("The secret number was : " + generatedNumber);
            } 
            else if (guess < generatedNumber) 
            {
                System.out.println("Too low! Try again.");
            } 
            else 
            {
                System.out.println("Too high! Try again.");
            }
          }
          else
          {
             System.out.println("You have exceeded the number of limit"); 
             break;
          }
        }
    }
}