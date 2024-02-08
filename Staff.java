package vetmanagementsystem;

import java.util.*;

public abstract class Staff {
    private String ref;
    private String name;

    public Staff(String ref, String name) {
        this.ref = ref;
        this.name = name;
    }

    // Getters
    public String getRef() {
        return ref;
    }

    public String getName() {
        return name;
    }

    // Abstract methods
    abstract void addBooking(Booking booking);
    abstract void removeBooking(Booking booking);
    abstract Booking nextBooking();
    abstract List<Booking> allBookings();
    abstract boolean checkAvailability(Date date);

    // Relationships
    abstract Surgery getDefaultSurgery();
}
