import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive integer (0 to stop): ");
        int num = s.nextInt();
        
        if (num == 0) {
            System.out.println("No numbers entered.");
            return;
        }
        
        int largest = num;
        int smallest = num;
        int sum = 0;
        int count = 0;
        
        while (num != 0) {
            sum += num;
            count++;
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
            
            System.out.print("Enter next integer (0 to stop): ");
            num = s.nextInt();
        }
        
        double average = (double) sum / count;
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.printf("Average: %.2f\n", average);
    }
}
