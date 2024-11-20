import java.util.Scanner;

public class DaysOfTheWeekWithDates{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter days of the week\n 1.Monday\n 2.Tuesday\n3.Wednessday\n4.Thursday\n5.Friday");

		int days = input.nextInt();
		
		switch(days){
		case 1:
			System.out.print("Monday");
		break;

		case 2:
			System.out.print("Tuesday");
		break;
		
		case 3:
			System.out.print("Wednessday");
		break;

		case 4:
			System.out.print("Thursday");
		break;

		case 5:
			System.out.print("Friday");
		break;

		case 6: 
			System.out.print("Saturday");
		break;
		
		case 7:
			System.out.print("Sunday");
		break;
		default: 
			System.out.print("Invalid input");
		}
	}

}