import java.util.Scanner;
import java.util.Random;
public class guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand= new Random();
        int number = rand.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("Guess a number between 1 and 100:");
        while (true) {
            guess = sc.nextInt();
            attempts++;
            if (guess == number) {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("Number of attempts: " + attempts);
                break;
            } else if (guess < number) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }
        sc.close();
    }
}