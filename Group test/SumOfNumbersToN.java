import java.util.Scanner;

public class SumOfNumbersToN{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int primeNumber = 0;
		int number = 0;
		int counter = 0;
		while(counter != 0){
		System.out.print("Enter number: ");
		int number = input.nextInt();
		if(primeNumber = number % 1 == number && number % counter == 0){
			System.out.print(primeNumber);
			}
			counter++;
		}
		System.out.println("Sum of prime number: " + primeNumber);
	}

}