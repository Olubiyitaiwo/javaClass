import java.time.LocalDate;

public class Room {
    private String roomType;
    private int roomNumber;
    private int roomPrice;
    private boolean isAvailable;
    private boolean isUnderMaintenance;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Room(String roomType, int roomNumber, int roomPrice, boolean isAvailable, boolean isUnderMaintenance,LocalDate checkInDate, LocalDate checkOutDate) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.roomPrice = roomPrice;
        this.isAvailable = isAvailable;
        this.isUnderMaintenance = isUnderMaintenance;
    }

        public String getRoomType() {
        return roomType;
        }
        public int getRoomNumber() {
        return roomNumber;
        }
        public int getRoomPrice() {
        return roomPrice;
        }
        public boolean isAvailable() {
        return isAvailable;
        }
        public boolean isUnderMaintenance() {
        return isUnderMaintenance;
        }
        public LocalDate getCheckInDate() {
        return checkInDate;
        }
        public LocalDate getCheckOutDate() {
        return checkOutDate;
        }
        public void setRoomType(String roomType) {
        this.roomType = roomType;
        }
        public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        }
        public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
        }
        public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        }
        public void setUnderMaintenance(boolean isUnderMaintenance) {
        this.isUnderMaintenance = isUnderMaintenance;
        }
        public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
        }
        public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
        }
        @Override
        public String toString() {
        return "Room [roomType=" + roomType + ", roomNumber=" + roomNumber + ", roomPrice=" + roomPrice + ", isAvailable=" + isAvailable + ", isUnderMaintenance=" + isUnderMaintenance + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + "]";
        }
}
