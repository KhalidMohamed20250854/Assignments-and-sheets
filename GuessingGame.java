import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int computerNumber = (int) (Math.random() * 5) + 1;
        
        System.out.print("Enter your guess (1-5): ");
        int userGuess = s.nextInt();
        
        if (userGuess == computerNumber) {
            System.out.println("Correct!");
        } else if (userGuess > computerNumber) {
            System.out.println("Too high");
        } else {
            System.out.println("Too low");
        }
        
        System.out.println("Computer chose: " + computerNumber);
    }
}
