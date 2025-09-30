import java.util.Scanner;

public class ShoppingCartApp {
    public static void main(String[] args) {
        CartHistory history = CartHistory.getInstance();
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n=== SHOPPING CART MENU ===");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Apply Coupon");
            System.out.println("4. View History");
            System.out.println("5. Undo Last Action");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String addItem = sc.nextLine();
                    history.addAction("Added item: " + addItem);
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String removeItem = sc.nextLine();
                    history.addAction("Removed item: " + removeItem);
                    break;
                case 3:
                    System.out.print("Enter coupon code: ");
                    String coupon = sc.nextLine();
                    history.addAction("Applied coupon: " + coupon);
                    break;
                case 4:
                    System.out.println(history);
                    break;
                case 5:
                    System.out.println(history.undoAction());
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
        System.out.println("Exiting Shopping Cart...");
    }
}
