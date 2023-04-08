package medium;

public class MaximumDistance {

    public static double totalDistance(double fuel, double fuelUsage, int passengers, boolean airConditioner) {
        double passUsage = passengers * fuelUsage * 0.05;

        double calculatedUsage = (fuelUsage + passUsage) / 100.0;
        double airUsage = airConditioner ? calculatedUsage * 0.1 : 0.0;
        calculatedUsage += airUsage;
        double result = fuel / calculatedUsage;
        return Math.round(result * 10.0) / 10.0;
    }

    public static void main(String[] args) {
        System.out.println(totalDistance(70.0, 7.0, 0, false));
        System.out.println(totalDistance(36.1, 8.6, 3, true));
        System.out.println(totalDistance(55.5, 5.5, 5, false));
    }
}
