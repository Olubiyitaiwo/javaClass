import java.util.Scanner;

public class PascalTriangle{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int number = input.nextInt();

		for(int counter = number; counter >0; counter--){
			for(int index = 0; index <= counter; index++){
				System.out.print(counter);
			}
				System.out.println(" ");
		}
	}
}