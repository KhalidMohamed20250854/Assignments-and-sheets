import java.util.Scanner;

class Location {
    private double maxValue;
    private int column;

    public Location() {
        this.maxValue = 0.0;
        this.column = 0;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public int getColumn() {
        return column;
    }

    public void locateLargest(double[] values) {
        if (values == null || values.length == 0) return;
        
        maxValue = values[0];
        column = 0;
        
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
                column = i;
            }
        }
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of columns in the array: ");
        int n = s.nextInt();
        
        double[] values = new double[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            values[i] = s.nextDouble();
        }
        
        Location loc = new Location();
        loc.locateLargest(values);
        
        System.out.println("The location of the largest element is " + loc.getMaxValue() + " at position (" + loc.getColumn() + ")");
    }
}
