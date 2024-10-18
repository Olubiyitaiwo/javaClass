import java.util.Scanner;

public class Pallindrum{
     public  static void main(String[] args){

             Scanner input = new Scanner(System.in);

             System.out.print("Enter a number: ");  
             int number = input.nextInt();
            
             int division = number / 100;
             System.out.printf("Anwer1:%d%n ", division);
  
             int remainder = number % 10;
             System.out.printf("Anser2: %d%n", remainder);

            if(division==remainder){
             System.out.println("Pallindrum");
            }else{
            System.out.print("Not a pallindrum");
            }
            
           
     }
}