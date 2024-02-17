package vetmanagementsystem;

import java.util.*;

public class VetManagementSystem {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Surgery> surgeries = new ArrayList<>();

    public static void main(String[] args) {
        // Populate surgeries (for demonstration)
        populateSurgeries();

        // Main menu loop
        while (true) {
            System.out.println("==== Veterinary Management System ====");
            System.out.println("1. Register a new booking");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Search for staff");
            System.out.println("4. Search for pets");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerBooking();
                    break;
                case 2:
                    cancelBooking();
                    break;
                case 3:
                    searchStaff();
                    break;
                case 4:
                    searchPets();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to populate surgeries (for demonstration)
    private static void populateSurgeries() {
        surgeries.add(new Surgery("ABC Veterinary Clinic", "12345", "09:00", "17:00"));
        surgeries.add(new Surgery("XYZ Animal Hospital", "54321", "08:00", "18:00"));
    }

    // Method to register a new booking
    private static void registerBooking() {
        // Display surgeries
        System.out.println("Available surgeries:");
        for (int i = 0; i < surgeries.size(); i++) {
            System.out.println((i + 1) + ". " + surgeries.get(i).getName());
        }
        System.out.print("Select a surgery (1-" + surgeries.size() + "): ");
        int surgeryIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        // Prompt user for booking details
        System.out.print("Enter staff reference: ");
        String staffRef = scanner.nextLine();
        System.out.print("Enter pet reference: ");
        String petRef = scanner.nextLine();
        // Add logic to retrieve staff and pet objects from surgeries

        // Add booking logic
        // surgery.makeBooking(staff, pet, startDate, endDate);
        System.out.println("Booking registered successfully.");
    }

    // Method to cancel a booking
    private static void cancelBooking() {
        // Display surgeries and bookings for cancellation
        System.out.println("Available surgeries:");
        for (int i = 0; i < surgeries.size(); i++) {
            System.out.println((i + 1) + ". " + surgeries.get(i).getName());
        }
        System.out.print("Select a surgery (1-" + surgeries.size() + "): ");
        int surgeryIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        Surgery surgery = surgeries.get(surgeryIndex);
        List<Booking> bookings = surgery.getAllBookings();
        System.out.println("Bookings for " + surgery.getName() + ":");
        for (int i = 0; i < bookings.size(); i++) {
            System.out.println((i + 1) + ". " + bookings.get(i).getRef());
        }
        System.out.print("Select a booking to cancel (1-" + bookings.size() + "): ");
        int bookingIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        Booking booking = bookings.get(bookingIndex);
        surgery.cancelBooking(booking);
        System.out.println("Booking cancelled successfully.");
    }

  // Method to search for staff
private static void searchStaff() {
    System.out.print("Enter staff reference: ");
    String staffRef = scanner.nextLine();

    // Iterate over surgeries to find staff
    for (Surgery surgery : surgeries) {
        Staff staff = surgery.findStaff(staffRef);
        if (staff != null) {
            System.out.println("Staff found:");
            System.out.println("Name: " + staff.getName());
            System.out.println("Reference: " + staff.getRef());
            return;
        }
    }

    System.out.println("Staff not found.");
}

// Method to search for pets
private static void searchPets() {
    System.out.print("Enter pet reference: ");
    String petRef = scanner.nextLine();

    // Iterate over surgeries to find pets
    for (Surgery surgery : surgeries) {
        Pet pet = surgery.findPet(petRef);
        if (pet != null) {
            System.out.println("Pet found:");
            System.out.println("Name: " + pet.getName());
            System.out.println("Reference: " + pet.getRef());
            return;
        }
    }

    System.out.println("Pet not found.");
}

