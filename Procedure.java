package patient;

import java.util.Scanner;

public class Procedure {
    private String name;
    private String date;
    private String practitioner; // Corrected variable name
    private double charge;

    public static Procedure createProcedureFromInput() {
        Scanner scanner = new Scanner(System.in);
        Procedure procedure = new Procedure();

        System.out.print("Procedure name: ");
        procedure.name = scanner.nextLine();

        System.out.print("Procedure date: ");
        procedure.date = scanner.nextLine();

        System.out.print("Practitioner: ");
        procedure.practitioner = scanner.nextLine(); // Corrected variable name

        boolean validCharge = false;
        while (!validCharge) {
            System.out.print("Procedure charge: ");
            String chargeInput = scanner.nextLine();
            try {
                procedure.charge = Double.parseDouble(chargeInput);
                if (procedure.charge <= 0) {
                    System.out.println("Invalid procedure charge. Enter a positive value.");
                } else {
                    validCharge = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid procedure charge. Enter a valid numeric value.");
            }
        }
        return procedure;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPractitioner() {
        return practitioner;
    }

    public double getCharge() {
        return charge;
    }
}
