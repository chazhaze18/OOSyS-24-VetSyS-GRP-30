package vetmanagementsystem;

import java.util.*;

public class Nurse extends Staff {
    public Nurse(String ref, String name) {
        super(ref, name);
    }

    // Implementing abstract methods
    @Override
    void addBooking(Booking booking) {
        // Add booking logic for Nurse
    }

    @Override
    void removeBooking(Booking booking) {
        // Remove booking logic for Nurse
    }

    @Override
    Booking nextBooking() {
        // Next booking logic for Nurse
        return null;
    }

    @Override
    List<Booking> allBookings() {
        // Retrieve all bookings logic for Nurse
        return null;
    }

    @Override
    boolean checkAvailability(Date date) {
        // Check availability logic for Nurse
        return true;
    }

    @Override
    Surgery getDefaultSurgery() {
        // Get default surgery logic for Nurse
        return null;
    }
}
