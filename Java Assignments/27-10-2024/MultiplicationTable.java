public class MultiplicationTable{

     public static void main(String[] args){
     
	
	for(int counter = 1; counter <= 12; counter++){
			
	   for(int index = 1; index <= 12; index++){

	       System.out.printf("\t%d*%d=%d", index, counter, counter * index);	
		
		System.out.print("\t\t");
		
	    }
	}
		//System.out.print("\t");
     }
}