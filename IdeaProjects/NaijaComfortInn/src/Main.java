import java.util.Scanner;

public class Main {
//    ArrayList<String> list = new ArrayList();
//    ArrayList<Integer> number = new ArrayList();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//    Guest guest = new Guest();
//    guest.setName();
//    System.out.println("Guest name: " + guest.getName());

        System.out.println("Enter the room type");
        String roomType = scanner.next();

        System.out.println("Enter the room number");
        int roomNumber = scanner.nextInt();

        System.out.println("Enter the room price");
        int roomPrice = scanner.nextInt();

        System.out.println("Is the room available?");
        boolean available = scanner.nextBoolean();

        System.out.println("Is the room under maintenance ?");
        boolean underMaintenance = scanner.nextBoolean();

        Room room = new Room();
        room.setRoomType(roomType);
        room.setRoomNumber(roomNumber);
        room.setRoomPrice(roomPrice);
        room.setAvailable(available);
        room.setUnderMaintenance(underMaintenance);
        room.setRoomList(room);

        System.out.println(Room.getRoomList());

    }

}