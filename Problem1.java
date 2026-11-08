import java.util.Scanner;

public class Problem1 {
    public static int getInt(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextInt();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = getInt(s, "Enter your age: ");
        System.out.println("Recorded Age: " + age);
    }
}
