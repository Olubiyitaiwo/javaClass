import java.util.Scanner;

public class NumberDeterminants{

    public static void main(String[] args){

           Scanner input = new Scanner(System.in);

           System.out.print("Enter the first number: ");
           int firstNumber = input.nextInt();

           System.out.print("Enter the second number: ");
           int secondNumber = input.nextInt();  

           System.out.print("Enter the third number: ");  
           int thirdNumber = input.nextInt();

           System.out.print("Enter the forth number: ");  
           int forthNumber = input.nextInt();

           System.out.print("Enter the fifth number; ");  
           int fifthNumber = input.nextInt();

           if(firstNumber<0){ System.out.println("Negative");
           }else if (firstNumber == 0) { System.out.println("zero");
           }else{ System.out.println("Positive");
           }

           if(secondNumber<0){ System.out.println("Negative");
           }else if (secondNumber == 0) { System.out.println("Zero");
           }else{ System.out.println("Positive");
           }

           if(thirdNumber<0){ System.out.println("Negative");
           }else if (thirdNumber == 0){ System.out.println("Zero");
           }else{ System.out.print("Positive");
           }

           if(forthNumber<0){ System.out.println("Negative");
           }else if(forthNumber == 0) { System.out.println("Zero");
           }else{ System.out.println("Positive");
           }

           if(fifthNumber<0){ System.out.println("Negative");
           }else if (fifthNumber == 0){ System.out.println("Zero");
           }else{ System.out.println("Positive");
           }

	}
}