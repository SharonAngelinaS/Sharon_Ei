import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static DecimalFormat format = new DecimalFormat(".##");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AcreageAdapter adapter = new AcreageAdapter();

        System.out.println("\n Real Estate Land Area Calculation ");

        boolean running = true;
        while (running) {
            System.out.print("\nEnter lot length in feet (or 0 to exit): ");
            double length = scanner.nextDouble();

            if (length == 0) {
                running = false; // exit condition
            } else {
                System.out.print("Enter lot width in feet: ");
                double width = scanner.nextDouble();

                
                double sqft = length * width;
                Estate estate = new Estate(sqft);

                double acres = adapter.getAcreage(estate);

                System.out.println("Total Area in Sq. Ft: " + format.format(sqft) + " sq. ft.");
                System.out.println("Estate Acreage: " + format.format(acres) + " acres");
            }
        }

        System.out.println("Exiting program...");
        scanner.close();
    }
}
