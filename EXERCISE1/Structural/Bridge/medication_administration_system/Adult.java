public class Adult extends Patient {
    protected Adult(Medicine med) {
        super(med);
    }

    @Override
    void selectPatient(int dose) {
        System.out.print("\tDoctor's Order: ");
        medicine.administerMedication(dose);
        System.out.println();
    }

    @Override
    void modifyMedication(int dose, int increment) {
        String message = (increment < 0) ? "minus " : "plus ";
        dose = (increment < 0) ? dose - Math.abs(increment) : dose + increment;
        System.out.println("\n\tDoctor-ordered dosage change: " +
                           message + Math.abs(increment) + " pills.");
        selectPatient(dose);
    }
}