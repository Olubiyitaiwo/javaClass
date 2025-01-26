import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Booking {
    private Random rand = new Random();
    private Room room;
    private List<Booking> bookingList = new ArrayList<>();
    private String bookingReference;
    private Guest guest;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Booking(Room room, String bookingReference, Guest guest, LocalDate checkInDate, LocalDate checkOutDate) {
        this.room = room;
        this.bookingReference ="012289";
        this.guest = guest;
        this.checkInDate = LocalDate.now();
        this.checkOutDate = LocalDate.now();
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public String getBookingReference() {
        return bookingReference;
    }
    public void setBookingReference(String bookingReference) {
        this.bookingReference = "MGH"+bookingReference;
    }
    public Guest getGuest() {
        return guest;
    }
    public void setGuest(Guest guest) {
        this.guest = guest;
    }
    public LocalDate getCheckInDate() {
        return checkInDate;
    }
    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }
    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    public List<Booking> getBookingList() {
        return bookingList;
    }
    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }
}
