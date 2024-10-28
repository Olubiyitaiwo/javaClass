import java.util.Scanner;

public class QuadraticEquation{
       public static void main(String[]args){

              Scanner input = new Scanner(System.in);

              System.out.print("Enter value for a: ");
              int a = input.nextInt();

              System.out.print("Enter value for b: ");
              int b = input.nextInt();

              System.out.print("Enter value for c: ");
              int c = input.nextInt();
     		
	      double discriminant = Math.sqrt((b*b) - 4*a*c);	
              if(discriminant > 0){
              System.out.println("has 2 real solutions");
              }else if(discriminant == 0){
              System.out.println("has 1 real solution");
              }else if(discriminant < 0){
              System.out.println("has 2 complex solutions");
              }
              System.out.println("Result: " + discriminant);
}
}