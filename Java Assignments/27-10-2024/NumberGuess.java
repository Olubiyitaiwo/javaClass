import java.util.Scanner;

public class NumberGuess{

     public static void main(String []args){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = input.nextInt();

            for(int counter = 3; number < 10; number++){
            if (number >10){
            System.out.print("Too high, try again");
            } 
            else if (number < 3){
            System.out.print("Too low, try again");
            }
           }
}
}