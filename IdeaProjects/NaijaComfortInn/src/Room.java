import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Room {
   static Random rand  = new Random();
   static ArrayList<Room> rooms = new ArrayList<>();

   private String roomType;
   private int roomNumber;
   private double roomPrice;
    private boolean isAvailable;
    private boolean isUnderMaintenance;

    public static Random getRand() {
        return rand;
    }

    public static void setRand(Random rand) {
        Room.rand = rand;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType='" + roomType + '\'' +
                ", roomNumber=" + roomNumber +
                ", roomPrice=" + roomPrice +
                ", isAvailable=" + isAvailable +
                ", isUnderMaintenance=" + isUnderMaintenance +
                '}';
    }

    public static ArrayList<Room> getRoomList() {
        return rooms;
    }

    public void setRoomList(Room room) {
        rooms.add(room);
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isUnderMaintenance() {
        return isUnderMaintenance;
    }

    public void setUnderMaintenance(boolean underMaintenance) {
        isUnderMaintenance = underMaintenance;
    }

}

