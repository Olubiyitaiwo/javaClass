import java.util.Scanner;

public class SumOfNaturalNumbers{

     public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int sum = 0;
            int number = 0;

            while(number<=10){
            System.out.print("Enter number:");
             number = input.nextInt();
            number++;

            sum = sum + number;
            }
            System.out.println("Sum :" + sum);
     }
}