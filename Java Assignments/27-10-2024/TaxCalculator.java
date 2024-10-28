import java.util.Scanner;

public class TaxCalculator{

     public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int taxOne = 15;
            int taxTwo = 20;
          
            int earningOne = 30_000;
            int earningTwo = 30_000; 

            if(taxOne == 15 && earningOne <= 30_000){
            System.out.println("Enter name: ");
            string name = input.next();
            System.out.println("Enter year: ");
            int year = input.nextInt();     
            }
            else if (taxTwo == 20 && earningTwo > 30_000){
            System.out.println("Enter names: ");
            System.out.println("Enter year: ");
            int year = input.nextInt();
            }
            else {
            System.out.println("Enter names: ");
            System.out.println("Enter year: ");
            int year = input.nextInt();
            }
            int taxTotal = taxOne + taxTwo;
            System.out.println("Total tax: " + taxTotal);
     }
}
