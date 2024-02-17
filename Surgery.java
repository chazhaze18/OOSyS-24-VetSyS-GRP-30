package vetmanagementsystem;

import java.util.*;

public class Surgery {
    private String name;
    private String postCode;
    private String openingTime;
    private String closingTime;
    private List<Staff> staffList;
    private List<Pet> petList;
    private List<Booking> bookingList;

    public Surgery(String name, String postCode, String openingTime, String closingTime) {
        this.name = name;
        this.postCode = postCode;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        staffList = new ArrayList<>();
        petList = new ArrayList<>();
        bookingList = new ArrayList<>();
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Methods for managing Staff
    public void registerStaff(Staff staff) {
        staffList.add(staff);
    }

    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    public Staff searchStaff(String ref) {
        for (Staff staff : staffList) {
            if (staff.getRef().equals(ref)) {
                return staff;
            }
        }
        return null;
    }

    // Methods for managing Pets
    public void registerPet(Pet pet) {
        petList.add(pet);
    }

    public void removePet(Pet pet) {
        petList.remove(pet);
    }

    public Pet searchPet(String ref) {
        for (Pet pet : petList) {
            if (pet.getRef().equals(ref)) {
                return pet;
            }
        }
        return null;
    }

    // Methods for managing Bookings
    public void makeBooking(Booking booking) {
        bookingList.add(booking);
    }

    public void cancelBooking(Booking booking) {
        booking.setStatus(BookingStatus.CANCELLED);
    }

    public Booking searchBooking(UUID ref) {
        for (Booking booking : bookingList) {
            if (booking.getRef().equals(ref)) {
                return booking;
            }
        }
        return null;
    }

    // Additional method to check if the given time falls within training/staff meeting slot
    public boolean isTrainingSlot(Date date) {
        // Logic to check if the given time falls within training/staff meeting slot
        return false;
    }

    // Additional methods as per requirements

    public List<Booking> getAllBookings() {
        return Collections.unmodifiableList(bookingList);
    }

    public List<Staff> getAllStaff() {
        return Collections.unmodifiableList(staffList);
    }

    public List<Pet> getAllPets() {
        return Collections.unmodifiableList(petList);
    }

    public List<Booking> getBookingsByStaff(Staff staff) {
        List<Booking> bookings = new ArrayList<>();
        for (Booking booking : bookingList) {
            if (booking.getStaff().equals(staff)) {
                bookings.add(booking);
            }
        }
        return Collections.unmodifiableList(bookings);
    }

    public List<Booking> getBookingsByPet(Pet pet) {
        List<Booking> bookings = new ArrayList<>();
        for (Booking booking : bookingList) {
            if (booking.getPet().equals(pet)) {
                bookings.add(booking);
            }
        }
        return Collections.unmodifiableList(bookings);
    }
}
