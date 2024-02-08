package vetmanagementsystem;

import java.util.*;

public class Cat extends Pet {
    public Cat(String ref, String name, String speciesName, Date regDate, Surgery surgery) {
        super(ref, name, speciesName, regDate, surgery);
    }

    // Implement abstract methods
    @Override
    void addBooking(Booking booking) {
        // Add booking logic for Cat
    }

    @Override
    void removeBooking(Booking booking) {
        // Remove booking logic for Cat
    }

    @Override
    Booking nextBooking() {
        // Next booking logic for Cat
        return null;
    }

    @Override
    List<Booking> allBookings() {
        // Retrieve all bookings logic for Cat
        return null;
    }
}
