import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Ride Booking System");

        do {
            System.out.println("\nChoose your ride:");
            System.out.println("1. Bike");
            System.out.println("2. Car");
            System.out.println("3. Auto");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 4) {
                System.out.println("Thank you for using Ride Booking System!");
                break;
            }

            Ride ride = RideFactory.getRide(choice);

            if (ride == null) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter Pickup Location: ");
            String pickup = sc.nextLine();
            System.out.print("Enter Destination: ");
            String drop = sc.nextLine();

            ride.book(pickup, drop);
            System.out.println("Ride booked successfully!");

        } while (choice != 4);

        sc.close();
    }
}