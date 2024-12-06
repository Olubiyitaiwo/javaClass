import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Dear customer please enter your card number: ");
		String cardNumber = input.next();
		
		char[] card = cardNumber.toCharArray();
			
			int sum = 0;
			int doubleOfSum = 0;
			int cardTotal = 0;
			for(int counter = card.length -1; counter > -1; counter--){
			 sum += counter;
			doubleOfSum = (sum*2); 
			System.out.print(card[counter]);
			if(doubleOfSum%2 == 1){
			
			}
		}
		System.out.println("Sum: " + sum);
		System.out.println("Double Of Sum: " + doubleOfSum);

			int sumAtOddPosition = 0;
		for(int counter = card.length -1; counter > '0'; counter-=2){
			sumAtOddPosition += counter;
		   System.out.print(card[counter]);
	
		}
		System.out.println("Sum at odd number position: " + sumAtOddPosition);	
	}


}