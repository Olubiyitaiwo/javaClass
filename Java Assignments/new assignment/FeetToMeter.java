import java.util.Scanner;

public class FeetToMeter{
       public static void main(String[] args){

              Scanner input = new Scanner(System.in);
              
             System.out.print("Enter a number: ");
             double numberInFeet =input.nextDouble();

             double numberConvertion = numberInFeet * 0.305;

             System.out.println("Number in meter: " + 
             numberConvertion);   
}
}

Pseudocode
collect number in feet
convert it to meter
Save the number
Display the result

Step Two
Prompt the user to enter a number in feet
collect the number
Save as "number in feet"
Convert to meter as  number is feet * 0.305
Save as number in meter
Display number in meter