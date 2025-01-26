import java.util.Scanner;

public class Guest {
    private Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }
    public void setLastName(String lastName) {
        System.out.println("Enter your last name: ");
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        System.out.println("Enter your email: ");
        this.email = email;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "input=" + input +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void setPhoneNumber(String phoneNumber) {
        System.out.println("Enter your phone number: ");
        this.phoneNumber = input.nextLine();
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
}