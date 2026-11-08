import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = s.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = s.nextInt();
        
        int sum = num1 + num2;
        double average = (double) sum / 2;
        int remainder = num1 % num2;
        
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Remainder: " + remainder);
    }
}
