import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Guest {
   private static final Scanner input = new Scanner(System.in);
   private static final ArrayList<Guest> guests = new ArrayList<>();
    private static final Random random = new Random();

    private String name ;
    private int phoneNumber ;
    private String email ;
    private int bookingReference;

//     public  void setName(){
//         this.name = input.nextLine();
//     }
     public void setPhoneNumber(){
         while (true){
             try {
                 System.out.println("Please enter a valid phone number");
                 this.phoneNumber = input.nextInt();
                 if (String.valueOf(phoneNumber).length() != 11){
                     System.out.println("Invalid phone number");
                 }else {
                     break;
                 }
             }catch (Exception e){
                 System.out.println("Invalid phone number, please enter a valid phone number");
             }
         }
     }
     public void setEmail(){
         this.email = input.nextLine();
     }
     public void setBookingReference(){
         this.bookingReference = random.nextInt(7);
     }
     public String getName(){
         return name;
     }
     public int getPhoneNumber(){
         return phoneNumber;
     }
     public String getEmail(){
         return email;
     }
     public int getBookingReference(){
         return bookingReference;
     }


}
