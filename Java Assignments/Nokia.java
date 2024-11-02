import java.util.Scanner;

public class Nokia{

       public static void main(String[] args){

              Scanner input = new Scanner(System.in);

              System.out.println("List of menu functions, please press: 1. Phone book\n 2. Messages\n 3. Chat\n 4. Call register\n 5. Tone\n 6. Settings\n 7. Call divert\n 8. Games\n 9. Calculator\n 10. Reminder\n 11. Clock\n 12.Profile\n 13 SIM services");
              int number = input.nextInt();

             switch(number){
             case 1:
             System.out.print("Phone book");
             System.out.println("1. Search\n 2. Service Nos\n 3. Add name\n 4. Erase \n 5. Edit\n 6.Assign tone\n 7. send b'card\n 8.option");
            int phoneBook = input.nextInt();
             switch(phoneBook){
             case 1:
             System.out.print("Search");
             break;
             case 2:
             System.out.print("Servive Nos");
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
             System.out.print("Options");
             break;
             System.out.println("1. Type of view\n 2. Memory status");
             int options = input.nextInt();
             switch(options){
             case 1:
              System.out.print("Types of view");
              break;
              case 2:
               System.out.print("Memory status");
              }
              break;
              case 9:
              System.out.print("Speed dials");
              break;
              case 10:
              System.out.print("voice tag");
             }
             break;

             case 2:
            System.out.print("Message");
            System.out.print("1. Write message\n 2. Inbox\n 3. Outbox\n 4. Picture message\n 5. Templates\n 6. Smileys\n 7. Message settings\n 8. Info service\n 9. Voice mail number\n 10. Service command editor");
             int message = input.nextInt();
              switch(message){
             case 1:
             System.out.print("Write messages");
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
             System.out.println("1. Set1\n 2. common");
             int messageSettings = input.nextInt();
             switch(messageSettings){
             case 1:
             System.out.print("Set 1");
             break;
             case 2:
             System.out.print("common");
             break;

             System.out.println("1. Message center number\n 2. Messages sent as \n 3. Messages validity");
             int set1 = input.nextInt();
              switch(set1){
             case 1:
             System.out.print("Message center number");
             break;
             case 2:
             System.out.print("Message sent as");
             break;
              case 3:
             System.out.print("Message validity");
             break;
             }
             System.out.print("1. Delivary reports\n 2. Reply via same centre\n 3. Character support");
              int common = input.nextInt();
              switch(common){
             case 1:
             System.out.print("Delivary reports");
             break;
              case 2:
             System.out.print("Reply via same center");
             break;
             case 3:
             System.out.print("Character support");
             break;
             }
             
            case 8:
            System.out.print("Info service");
            break;
            case 9:
            System.out.print("Voice mailbox number");
            break;
            case 10:
            System.out.print("Service command editor");
            }
               case 3:
            System.out.print("Chat");
            break;

              case 4:
            System.out.print("Call resgister");
             System.out.print("1. Missed calls\n 2. Received calls\n 3. Dialled numbers\n 4. Erase recent call lists\n 5. Showing call duration\n 6. Show call cost\n 7. Call cost limit\n 8. Prepaid credit");
            int callRegister = input.nextInt();
             switch(callRegister){
            case 1:
            System.out.print("Missed calls");
            break;
            case 2:
            System.out.print("Received calls");
            break;
            case 3:
            System.out.print("Dialled number");
            break;
            case 4:
            System.out.print("Erase recent call lists");
            break;
            case 5:
            System.out.print("Showing call duration");
            System.out.println("1. Last call duration\n 2. All calls' duration\n 3. Received call's duration\n 4. Dialled calls' duration\n 5. Clear timer");
            int showCallDuration = input.nextInt();
            switch(showCallDuration){
            case 1:
            System.out.print("Last call duration");
            break;
            case 2:
            System.out.print("All calls' duration");
            break;
            case 3:
            System.out.print("Received call's duration");
            break;
             case 4:
            System.out.print("Dialled calls' duration");
            break;
            case 5:
            System.out.print("Clear timer");
            break;
            }
            case 6:
            System.out.print("Show call cost");
            System.out.printl("1. Last call cost\n 2. All calls's cost\n 3. Clear counter");
            int showCallCost = input.nextInt();
            switch(showCallCost){
            case 1:
             System.out.print("Last call cost");
             break;
             case 2:
             System.out.print("All calls's cost");
             break;
             case 3:
             System.out.print("Clear counter");
             break;
            }
            case 7:
            System.out.print("Call cost settings");
            System.out.println("1. Call cost limit\n 2. Show costs in");
            int callCostSettings = input.nextInt();
            switch(callCostSettings){
            case 1:
            System.out.print("Call cost limit");
            break;
             case 2:
            System.out.print("Show costs in");
            break;
            }
            case 8:
            System.out.print("Prepaid credit");
            break;
            }

             case 5:
            System.out.print("Tones");
             System.out.println("1. Ring tone\n 2. Ringing volume\n 3. Incoming call alert\n 4. Composer\n 5. Message alert tone\n 6. Keypad tone\n 7. Warning and game tones\n 8. Vibration alert\n 9. Screen saver");
             int tone = input.nextInt();
             switch(tone){
             case 1:
             System.out.print("Ring tone");
             break;
             case 2:
             System.out.print("Ringing volume");
             break;
             case 3:
             System.out.print("Incoming call alert");
             break;
             case 4:
             System.out.print("Composer");
             break;
             case 5:
             System.out.print("Message alert tone");
             break;
             case 6:
             System.out.print("Keypad tone");
             break;
              case 7:
             System.out.print( "Warning and game tones");
             break;
             case 8:
             System.out.print("Vibration alert");
             break;
              case 9:
             System.out.print("Screen saver");
             break;
              }
            
             case 6:
             System.out.print("Settings");
             System.out.println("1. Call setting\n 2. Phone settings\n 3. Security settings\n 4. Restore factory settings");
             int settings = input.nextInt();
             switch(settings){
             case 1:
             System.out.print("Call setting");
             System.out.println("1. Automatic redial\n 2. Speed dialing\n 3. Call waiting option\n 4. Own number sending\n 5. Phone line in use\n 6. Automatic answer ");
             int callSettings = input.nextInt();
             switch(callSettings){
             case 1:
             System.out.print("Automatic redial");
             break;
              case 2:
             System.out.print("Speed dialing");
             break;
              case 3:
             System.out.print(" Call waiting option");
             break;
              case 4:
             System.out.print("Own number sending");
             break;
              case 5:
             System.out.print(" Phone line in use");
             break;
              case 6:
             System.out.print("Automatic answer");
             break;
              }
              
             case 2:
             System.out.print("Phone settings");
             System.out.println("1. Language\n 2. Call info display\n 3. Welcome note\n 4. Network selection\n 5. Lights\n 6. Confirm SIM service actions");
             int phoneSettings = input.nextInt();
             switch(phoneSettings){
             case 1:
             System.out.print("Language");
             break;
             case 2:
             System.out.print("Call info display");
             break;
             case 3:
             System.out.print("Welcome note");
             break;
             case 4:
             System.out.print("Network selection");
             break;
             case 5:
             System.out.print("Lights");
             break;
             case 6:
             System.out.print("Confirm SIM service actions");
             break;
             }
             
             case 3:
             System.out.print("Security settings");
             System.out.println("1. PIN settings\n 2. Call barring service\n 3. Fixed dialling\n 4. Cosed user group\n 5. Phone security\n 6. Change access code");
             int securitySettings = input.nextInt();
             switch(securitySettings){
             case 1:
             System.out.print("PIN settings");
             break;
             case 2:
             System.out.print("Call barring service");
             break;
             case 3:
             System.out.print("Fixed dialling");
             break;
             case 4:
             System.out.print("Cosed user group");
             break;
             case 5:
             System.out.print("Phone security");
             break;
             case 6:
             System.out.print(" Change access code");
             break;
             }

             case 7:
             System.out.print("Call divert");
             break;
             case 8:
             System.out.print("Games");
             break;
             case 9:
             System.out.print("Calculator");
             break;
             case 10:
             System.out.print("Reminder");
             break;
             case 11:
             System.out.print("Clock");
             System.out.println("1. Alarm clock\n 2. Clock settings\n 3. Date setting\n 4. Stopwatch\n 5. Counterdown timer\n 6. Auto update of date and time");
             int clock = input.nextInt();
             switch(clock){
             case 1:
             System.out.print("Alarm clock");
             break;
             case 2:
             System.out.print("Clock settings");
             break;
             case 3:
             System.out.print("Date setting");
             break;
             case 4:
             System.out.print("Stopwatch");
             break;
             case 5:
             System.out.print(" Counterdown timer");
             break;
             case 6:
             System.out.print("Auto update of date and time");
             break;
             }

             case 12:
             System.out.print("Profile");
             break;
             case 13:
             System.out.print("SIM services");
             break;
             }

             
             }
         }    
              
    } 
 }       
