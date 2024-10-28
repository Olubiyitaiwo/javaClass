import java.util.Scanner;

public class LoopOfTwoNumber{

       public static void main(String[] args){

              Scanner input = new Scanner(System.in);
           
              int counter = 0;
		String response = null;
              
              do{

              System.out.print("Enter number: ");
              int number = input.nextInt();
              
              System.out.print("Enter second number: ");
              int number2 = input.nextInt();
             
              int sum = number + number2;

               System.out.println("Sum: " + sum);

               System.out.print("Do you wish to perform operation again?");
                response = input.next();
               
               }while(response.equalsIgnoreCase("yes"));
              
              
       }
}