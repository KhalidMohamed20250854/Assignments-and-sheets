import java.util.Scanner;

public class Q1 {
    public static int generateSecret() {
        return (int) (Math.random() * 50) + 1;
    }

    public static String checkGuess(int guess, int secret) {
        if (guess == secret) {
            return "Correct";
        } else if (guess > secret) {
            return "Lower";
        } else {
            return "Higher";
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int secret = generateSecret();
        int[] guesses = new int[5];
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Secret Number (" + secret + ")"); // For testing/viewing as in sample run

        for (int i = 0; i < 5; i++) {
            System.out.print("Guess: ");
            int guess = s.nextInt();
            guesses[i] = guess;
            attempts++;

            String result = checkGuess(guess, secret);
            if (result.equals("Correct")) {
                System.out.println("Correct in " + attempts + " attempts");
                guessedCorrectly = true;
                break;
            } else {
                System.out.println(result);
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Secret number was: " + secret);
        }
    }
}
