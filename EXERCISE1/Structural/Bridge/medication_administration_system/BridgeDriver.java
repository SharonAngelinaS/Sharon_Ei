import java.util.Scanner;

public class BridgeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Medication Administering System ===");

        while (true) {
            System.out.println("\nSelect Patient Type: 1. Adult  2. Child  3. Exit");
            int patientChoice = scanner.nextInt();
            if (patientChoice == 3) break;

            System.out.println("Select Medicine Type: 1. Antibiotic  2. Pain Relief");
            int medicineChoice = scanner.nextInt();

            Medicine medicine = (medicineChoice == 1) ? new Antibiotic() : new PainRelief();
            Patient patient = (patientChoice == 1) ? new Adult(medicine) : new Child(medicine);

            System.out.print("Enter initial dosage: ");
            int dose = scanner.nextInt();
            patient.selectPatient(dose);

            System.out.print("\nDo you want to modify dosage? (yes=1 / no=0): ");
            int modify = scanner.nextInt();
            if (modify == 1) {
                System.out.print("Enter increment (negative to reduce): ");
                int increment = scanner.nextInt();
                patient.modifyMedication(dose, increment);
            }
        }
        System.out.println("Exiting Medication System...");
        scanner.close();
    }
}