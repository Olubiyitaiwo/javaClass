import java.util.Scanner;

public class BodyMassIndexCalculator{
       public static void main(String[] args){
              Scanner input = new Scanner(System.in);
           
             System.out.print("Enter weight in mass: ");
             double  weight = input.nextDouble();

             System.out.print("Enter height in meter: ");
             double height = input.nextDouble();

             double bodyMassIndex = weight / (height * height);
             System.out.printf("Body Mass Index: %d%n" bodyMassIndex);
}
}


           PSUEDOCODE
STAGE ONE
Collect weight in mass
Save weight
collect height in meter
save height
calculate body mass index

STATGE TWO
Prompt the user to enter value of weight in kilogram
collect the value 
save as "weight"
prompt the user to enter another value for height in meter
collect the value
save as height
calculate body mass index as Body Mass Index = weight / (height * height)
save the result as Body Mass Index
display Body Mass Index