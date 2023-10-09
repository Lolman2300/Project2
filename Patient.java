package patient;

import java.util.Scanner;

public class Patient {

    private String name;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String emergencyContact;

    public static Patient createPatientFromInput() {
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient();

        System.out.print("Patient Name: ");
        patient.name = scanner.nextLine();

        System.out.print("Address: ");
        patient.address = scanner.nextLine();

        System.out.print("City: ");
        patient.city = scanner.nextLine();

        System.out.print("State: ");
        patient.state = scanner.nextLine();

        boolean validZipcode = false;
        while (!validZipcode) {
            System.out.print("Zipcode: ");
            patient.zipcode = scanner.nextLine();
            if (!isValidZipcode(patient.zipcode)) {
                System.out.println("Invalid Zipcode. Please try again.");
            } else {
                validZipcode = true;
            }
        }

        System.out.print("Emergency Contact: ");
        patient.emergencyContact = scanner.nextLine();
        return patient;
    }

    private static boolean isValidZipcode(String zipcode) {
        // Add your validation logic here.
        // For example, you can check if the zipcode is a valid format (e.g., 5 digits).
        // You may also consider using regular expressions for more specific validation.
        return zipcode.matches("^\\d{5}$");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }
}
