import java.util.Scanner;

public class Problem2 {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2: ");
        double x1 = s.nextDouble();
        double y1 = s.nextDouble();
        double x2 = s.nextDouble();
        double y2 = s.nextDouble();
        
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Distance: %.2f\n", distance);
    }
}
