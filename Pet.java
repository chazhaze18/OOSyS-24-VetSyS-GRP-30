package vetmanagementsystem;

import java.util.*;

public abstract class Pet {
    private String ref;
    private String name;
    private String speciesName;
    private Date regDate;
    private Surgery surgery;

    public Pet(String ref, String name, String speciesName, Date regDate, Surgery surgery) {
        this.ref = ref;
        this.name = name;
        this.speciesName = speciesName;
        this.regDate = regDate;
        this.surgery = surgery;
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

    // Relationships
    public Surgery getSurgery() {
        return surgery;
    }
}
