import java.util.Scanner;

public class LoopDetermineLargestAndSmallestNumber{
      public static void main(String[] args){

             Scanner input = new Scanner(System.in);
             
             int lagestNumber = 0;
             int smallestNumber = 0;
	     int counter =0;
             while(counter !=-1){
		System.out.print("Enter a number or -1 to end: ");
                 counter = input.nextInt();
                 if(counter ==-1){
                 break;
                 }
              	if(counter > lagestNumber){
			lagestNumber = counter;	
		}
		else{
			smallestNumber = counter;
			}
               }
                         

		System.out.println("The largest Number is "+lagestNumber);

		System.out.println("The smallest Number is "+smallestNumber);



			



     }
}