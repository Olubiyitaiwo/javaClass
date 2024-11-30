import java.util.Scanner;
public class Nokia2{

	public static void main(String[] args){

	meun();

	}


	public static void meun(){
	Scanner input = new Scanner(System.in);
	
	System.out.print("""
		Nokia Menu
		1. Phone book
		2. Message
		3. Chat
		4. Call register
		0. go back to main menu
		 """);
	int phoneBook = input.nextInt();
	
	switch(phoneBook){
	case 1:
	System.out.print("""
		1. Search
		2. Service
		3. Add name
		4. Erase
		5. Edit
		6. Assign tone
		7. Send b'card
		8. Option
		9. Speed dial
		10. voice tag
                0. go back to main menu
	""");
	int search = input.nextInt();
	
	switch(search){
		case 1:
		System.out.print("Search...");
		break;
                case 2:
		System.out.print("Service...");
		break;
		case 3:
		System.out.print("Add name");
		break;
		case 4:
		System.out.print("Erase");
		break;
		case 5:
		System.out.print("Edit");
		break;
		case 6:
		System.out.print("Assign tone");
		break;
		case 7:
		System.out.print("Send b'card");
		break;
		case 8:
		System.out.println("Options");
		System.out.println("""
		1. Type of view
		2. Memory status
		""");
		int option = input.nextInt();

		switch(option){
		case 1:
		System.out.print("Type of view");
		break;
		case 2:
		System.out.print(" Memory status");
		break;
		}
		case 9:
		System.out.print("Speed dial");
		break;
		case 10:
		System.out.print("voice tag");
		break;
		case 0:
		meun();
		
		
		}
               case 2:
		System.out.print("""
		1. Write message
		2. Inbox
		3. Outbox
		4. Picture message 
		5. Template
		6. Smileys
		7. Message settings
		8. Info service
		9. Voice mail number
		10. Service command editor
		""");
		int message = input.nextInt();
		switch(message){
		case 1:
		System.out.print("Write message");
		break;
		case 2:
		System.out.print("Inbox");
		break;
		case 3:
		System.out.print("Outbox");
		break;
		case 4:
		System.out.print("Picture message");
		break;
		case 5:
		System.out.print("Template");
		break;
		case 6:
		System.out.print("Simileys");
		break;
		case 7:
		System.out.print("Message settings");
		System.out.print("""
		1. Set1
		2. common
		""");
		int MessageSettings = input.nextInt();
		switch(MessageSettings){
		case 1:
		System.out.print("Set1");
		break;
		case 2:
		System.out.print("common");
		break;
		}
		}
              break;
		
	
        
     
        case 0:
        meun();
        break; 
	}

	}
}