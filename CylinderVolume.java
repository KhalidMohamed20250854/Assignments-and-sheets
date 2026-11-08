public class CylinderVolume {
    public static double cylinderVolume(double dValue, double hValue) {
        double radius = dValue / 2.0;
        double volume = Math.PI * Math.pow(radius, 2) * hValue;
        return volume;
    }

    public static void main(String[] args) {
        double d = 10.0;
        double h = 5.0;
        System.out.println("Volume: " + cylinderVolume(d, h));
    }
}
