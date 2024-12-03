import java.util.Scanner;
import java.util.Arrays;

public class LagbajaSchool{

	public static void main(String[] args){
	
		studentDetails();
		studentGrade1();
		studentGrade2();
		studentGrade3();
		studentGrade4();
	

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
	public static void studentGrade1(){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		double average = 0;
		int[][] scores = new int[1][3];
		System.out.print("Enter students: ");
		for(int counter = 0; counter < scores.length; counter++){
			for(int index = 0; index < scores[counter].length; index++){
			System.out.println("Entering scores for student 1");
			System.out.println("Enter scores for subjects : ");
				scores[counter][index] = input.nextInt();
				sum += scores[counter][index];
				average = sum/3;
		  }
		}
		System.out.println("Student 1: " + Arrays.deepToString(scores));
		System.out.println("Total: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
	}

	public static void studentGrade2(){
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		double average = 0;
		int[][] scores = new int[1][3];
		System.out.print("Enter students: ");
		for(int counter = 0; counter < scores.length; counter++){
			for(int index = 0; index < scores[counter].length; index++){
			System.out.println("Entering scores for student 2");
			System.out.println("Enter scores for subjects: ");
				scores[counter][index] = input.nextInt();
				sum += scores[counter][index];
				average = sum/3;
		  }
		}
		System.out.println("Student 2: " + Arrays.deepToString(scores));
		System.out.println("Total: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
	}

		public static void studentGrade3(){
		Scanner input = new Scanner(System.in);
		
			int sum = 0;
			double average = 0;
		int[][] scores = new int[1][3];
		System.out.print("Enter student: ");
		for(int counter = 0; counter < scores.length; counter++){
			for(int index = 0; index < scores[counter].length; index++){
			System.out.println("Entering scores for student 3");
			System.out.println("Enter scores for subject : ");
				scores[counter][index] = input.nextInt();
				sum += scores[counter][index];
				average = sum/3;
		  }
		}
		System.out.println("Student 3:" + Arrays.deepToString(scores));
		System.out.println("Total: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
	}
	
	public static void studentGrade4(){
		Scanner input = new Scanner(System.in);
		int sum =0;
		double average = 0;
		int[][] scores = new int[1][3];
		System.out.print("Enter student: ");
		for(int counter = 0; counter < scores.length; counter++){
			for(int index = 0; index < scores[counter].length; index++){
			System.out.println("Entering scores for student 4");
			System.out.println("Enter scores for subject : ");
				scores[counter][index] = input.nextInt();
				sum += scores[counter][index];
				average = sum/3;
		  }
		}
		System.out.println("Student 4:" + Arrays.deepToString(scores));
		System.out.println("Total: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");
	}
		

}