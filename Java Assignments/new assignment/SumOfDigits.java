import java.util.Scanner;

public class SumOfDigits{
       public static void main(String[] args){

             Scanner input = new Scanner(System.in);

             System.out.print("Enter an integer: ");
             int integer = input.nextInt();
              
             int firstNumber = integer / 100;
             System.out.println("First number: " + firstNumber);

             int secondInteger = integer % 100;
             int secondNumber = secondInteger /10;
             System.out.println("Second number: " + secondNumber);

             int thirdNumber = integer % 10;
             System.out.println("Third number:" + thirdNumber);

             int sum = firstNumber + secondNumber + thirdNumber;
             System.out.print("Sum of digits: " + sum); 
       }
}

          PSEUDOCODE
STEP ONE
Collect an integer of hundred
Get the first number
Get the second number
Get the third number
Sum the first, second and third number togther
Display the result

STEP TWO
Prompt a user to enter an integer of hundred
collect the number
Save as integer
To get first number: divide integer by 100
To get second number: module integer by 100
 save the result as result
Calculate sum as first number + second number + third number
Save result as Sum of Digits
Display Sum of digits



