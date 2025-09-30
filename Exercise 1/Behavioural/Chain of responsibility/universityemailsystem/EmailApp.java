

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Handler academic = new AcademicHandler();
        Handler alumni = new AlumniHandler();
        Handler placement = new PlacementHandler();
        Handler office = new OfficeHandler(); // fallback

        academic.setNext(alumni);
        alumni.setNext(placement);
        placement.setNext(office);

        Scanner sc = new Scanner(System.in);
        System.out.println("Email system started. Type 'exit' to quit.");

        while (sc.hasNextLine()) {
            String text = sc.nextLine();

            if ("exit".equalsIgnoreCase(text)) {
                System.out.println("Goodbye!");
                break;
            }

            academic.handle(text);
        }
        sc.close();
    }
}