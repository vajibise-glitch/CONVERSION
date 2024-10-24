package assignment;

public class assignment {

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Display Feet to Meters table
        System.out.println("Feet    Meters");
        for (int feet = 1; feet <= 10; feet++) {
            double meters = footToMeter(feet);
            System.out.printf("%-8d%.3f%n", feet, meters);
        }

        // Display Meters to Feet table
        System.out.println("\nMeters    Feet");
        for (int meters = 20; meters <= 65; meters += 5) {
            double feet = meterToFoot(meters);
            System.out.printf("%-10d%.3f%n", meters, feet);
        }
    }
}
	