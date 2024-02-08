package vetmanagementsystem;

import java.util.*;

public class Surgeon extends Staff {
    private List<Surgery> consultingSurgeries;

    public Surgeon(String ref, String name) {
        super(ref, name);
        consultingSurgeries = new ArrayList<>();
    }

    // Implementing abstract methods
    @Override
    void addBooking(Booking booking) {
        // Add booking logic for Surgeon
    }

    @Override
    void removeBooking(Booking booking) {
        // Remove booking logic for Surgeon
    }

    @Override
    Booking nextBooking() {
        // Next booking logic for Surgeon
        return null;
    }

    @Override
    List<Booking> allBookings() {
        // Retrieve all bookings logic for Surgeon
        return null;
    }

    @Override
    boolean checkAvailability(Date date) {
        // Check availability logic for Surgeon
        return true;
    }

    @Override
    Surgery getDefaultSurgery() {
        // Get default surgery logic for Surgeon
        return null;
    }

    // Additional method for Surgeon to add consulting surgery
    public void addConsultingSurgery(Surgery surgery) {
        consultingSurgeries.add(surgery);
    }
}
