import java.util.Scanner;

public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int num = s.nextInt();
        
        int tens = num / 10;
        int ones = num % 10;
        int sum = tens + ones;
        
        System.out.println("Tens digit: " + tens);
        System.out.println("Ones digit: " + ones);
        System.out.println("Sum: " + sum);
    }
}
