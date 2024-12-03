import java.util.Scanner;
import java.util.Arrays;

public class LagbajaSchool{

	public static void main(String[] args){
	
		studentDetails();
		studentGrade();
	

	}
	public static void studentDetails(){
		Scanner input = new Scanner(System.in);
		System.out.print("How many students do you have?: ");
		    int studentNumber = input.nextInt();
		System.out.println(studentNumber);

		System.out.print("How many subject do they offer?: ");
		 int numberOfSubject = input.nextInt();
		System.out.println(numberOfSubject);


		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
	}
	public static void studentGrade(){
		Scanner input = new Scanner(System.in);
		
		int[][] scores = new int[1][100];
		System.out.print("Enter student: ");
		for(int counter = 0; counter < scores.length; counter++){
			for(int index = 0; index < scores[counter].length; counter++){
			System.out.println("Entering scores for student 1");
			System.out.println("Enter scores for subject 1: ");
				scores[counter][index] = input.nextInt();
		  }
		}
		System.out.println(Arrays.deepToString(scores));
	}

}