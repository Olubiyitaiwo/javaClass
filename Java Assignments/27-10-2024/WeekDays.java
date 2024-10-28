import java.util.Scanner;

public class WeekDays{
       public static void main(String[] args){

              Scanner input = new Scanner(System.in);
              System.out.print("Enter number: ");
              int number = input.nextInt();

              if (number == 1){
              System.out.print("Monday");
              }else if(number==2){
              System.out.print("Tuesday");
              }else if(number==3){
              System.out.print("Wednessday");
              }else if(number==4){
              System.out.print("Thursday");
              }else if(number==5){
              System.out.print("Friday");
              }else if(number==6){
              System.out.print("Saturday");
              }else if(number==7){
              System.out.print("Sunday");
              }

       }
}