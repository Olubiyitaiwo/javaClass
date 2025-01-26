import java.util.Scanner;

public class NumberGuess2{

     public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if(number=0; number==8; number++){
               if (number >= 12){
                 System.out.print("Number too high" "Try again later");
                } else if(number <= 4){
                System.out.print("number too low" " try again later");
                }else if(number == 8){
                System.out.print("You're right");
               }
              }
     }
}