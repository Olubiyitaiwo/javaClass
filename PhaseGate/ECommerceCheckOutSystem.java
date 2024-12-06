import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;

public class ECommerceCheckOutSystem{


	public static void main(String[] args){
		semicolonStore();
		getTime();
		cashierDetails();
		customerName();
		userBuy();
		userQuantity();
		userPrice();
		userItems();
		
	}
	
	public static void customerName(){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Hi customer, what is your name: ");
		String name = input.nextLine();
	 
	}

	public static void userBuy(){
	Scanner input = new Scanner(System.in);
	System.out.print("What did you want to buy: ");
		String buy = input.nextLine();
	}

	public static void userQuantity(){
	Scanner input = new Scanner(System.in);
		System.out.print("How many pieces: ");
		int pieces = input.nextInt();
	
	}

	public static void userPrice(){
	Scanner input = new Scanner(System.in);
		System.out.print("How much per unit: ");
		int pieces = input.nextInt();
	
	}

	public static void userItems(){
	Scanner input = new Scanner(System.in);
		System.out.print("""
				Add more items?: 
				1. yes;
				2. no;
				""");
		int items = input.nextInt();
	
		switch(items){
			case 1:
				userBuy();
		       		userQuantity();
				userPrice();
			break;
			case 2:
				customerName();
		}
	
	}

	public static void userDiscount(){
		Scanner input = new Scanner(System.in);
		System.out.print("How much discount will you get?: ");
		int discount = input.nextInt();

	}
	public static void semicolonStore(){
		System.out.print("""
		SEMICOLON STORE
		MAIN BRANCH
		LOCATION: 312, HERBERT MACUAULY WAY, SABO YABA, LAGOS.
		TEL: 0807665888
		""");
		}

	public static void getTime(){
		Date date = new Date();
		System.out.println("Date: " + date);
		}

	public static void cashierDetails(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cashier name: ");
		String name = input.nextLine();
		System.out.print("Enter customer name: ");
		String customerName = input.nextLine();

	}
}