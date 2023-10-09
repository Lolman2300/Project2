package patient;

public class PatientFileDriver {
    public static void main(String[] args) {
        Patient patient = Patient.createPatientFromInput();

        Procedure procedure1 = Procedure.createProcedureFromInput();
        Procedure procedure2 = Procedure.createProcedureFromInput();
        Procedure procedure3 = Procedure.createProcedureFromInput();

        System.out.println("\nPatient Information: ");
        System.out.println("Patient name: " + patient.getName());
        System.out.println("Address: " + patient.getAddress());
        System.out.println("City: " + patient.getCity());
        System.out.println("State: " + patient.getState());
        System.out.println("Zip: " + patient.getZipcode());
        System.out.println("Emergency Contact: " + patient.getEmergencyContact());

        System.out.println("\nProcedure 1 Information: ");
        System.out.println("Procedure: " + procedure1.getName());
        System.out.println("Procedure Date: " + procedure1.getDate());
        System.out.println("Practitioner: " + procedure1.getPractitioner());
        System.out.print("Procedure Charge: " + procedure1.getCharge());

        System.out.println("\nProcedure 2 Information: ");
        System.out.println("Procedure 2: " + procedure2.getName());
        System.out.println("Procedure Date: " + procedure2.getDate());
        System.out.println("Practitioner: " + procedure2.getPractitioner());
        System.out.print("Procedure Charge: " + procedure2.getCharge());

        System.out.println("\nProcedure 3 Information: ");
        System.out.println("Procedure 3: " + procedure3.getName());
        System.out.println("Procedure Date: " + procedure3.getDate());
        System.out.println("Practitioner: " + procedure3.getPractitioner());
        System.out.print("Procedure Charge: " + procedure3.getCharge());

        System.out.println("\nStudent Information:");
        System.out.println("Student Name: Brandon Tran");
        System.out.println("Due Date: 9/7/23");
    }
}
