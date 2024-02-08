package vetmanagementsystem;

import java.util.*;

public class Dog extends Pet {
    public Dog(String ref, String name, String speciesName, Date regDate, Surgery surgery) {
        super(ref, name, speciesName, regDate, surgery);
    }

    // Implement abstract methods
    @Override
    void addBooking(Booking booking) {
        // Add booking logic for Dog
    }

    @Override
    void removeBooking(Booking booking) {
        // Remove booking logic for Dog
    }

    @Override
    Booking nextBooking() {
        // Next booking logic for Dog
        return null;
    }

    @Override
    List<Booking> allBookings() {
        // Retrieve all bookings logic for Dog
        return null;
    }
}

