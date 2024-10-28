import java.util.Scanner;

public class ThreeDecimalPlaces{

     public static void main(String[] args){

       Scanner input = new Scanner(System.in);

       System.out.print("Enter number: ");
       float number = input.nextFloat();

       int wholeNumber = (int)number*1000;
       float decimalNumber = (int)number/1000;

       System.out.print("Enter another number: ");
       float number2 = input.nextFloat();
       
       int wholeNumber2 = (int)number2*1000;
       float decimalNumber2 =(int)number2/1000;

        if(decimalNumber == decimalNumber2){
        System.out.print("Same");
        }else if(decimalNumber != decimalNumber2){
        System.out.print("Not the same");
        }


     }
}