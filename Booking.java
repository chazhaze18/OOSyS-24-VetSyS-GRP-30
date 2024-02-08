package vetmanagementsystem;

import java.util.*;

public class Booking {
    private UUID ref;
    private Staff staff;
    private Pet pet;
    private Date startDate;
    private Date endDate;
    private BookingStatus status;

    public Booking(Staff staff, Pet pet, Date startDate, Date endDate) {
        this.ref = UUID.randomUUID();
        this.staff = staff;
        this.pet = pet;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = BookingStatus.ACTIVE;
    }

    // Getters
    public UUID getRef() {
        return ref;
    }

    public BookingStatus getStatus() {
        return status;
    }

    // Setters
    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    // Additional method to get staff associated with the booking
    public Staff getStaff() {
        return staff;
    }

    // Additional method to get pet associated with the booking
    public Pet getPet() {
        return pet;
    }
}
