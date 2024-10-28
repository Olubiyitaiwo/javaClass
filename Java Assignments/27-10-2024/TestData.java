import java.util.Scanner;

public class TestData{
     public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter year: ");
            int year = input.nextInt();

            if(year%4 == 0){
            System.out.print(year + " is a leap year");
            }else if(year%4 !=0){
            System.out.print(year + " is not a leap year");
            }

     }
}