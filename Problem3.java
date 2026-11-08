public class Problem3 {
    public static double computeArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double computeArea(double length, double width) {
        return length * width;
    }

    public static double computeArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("Circle Area = " + computeArea(5.0));
        System.out.println("Rectangle Area = " + computeArea(4.0, 6.0));
        System.out.println("Triangle Area = " + computeArea(4.0, 6.0, true));
    }
}
