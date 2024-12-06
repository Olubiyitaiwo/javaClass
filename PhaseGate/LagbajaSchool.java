import java.util.Scanner;
import java.util.Arrays;

public class LagbajaSchool{

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);


	System.out.print("How many students do you have?: ");
	int studentNumber = input.nextInt();

	System.out.print("How many subjects do they offer?: ");
	int numberOfSubject = input.nextInt();

	System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved successfully");
	System.out.println();

	System.out.println("Enter Students Scores: ");
	System.out.println();

	int sum = 0;
	double scores = 0;

	int [][] score = new int [studentNumber][numberOfSubject];
	int [] total = new int [studentNumber];
	double [] average = new double [studentNumber];
	int [] positioning = new int [studentNumber];
	int [] sorting = new int [studentNumber];


	for(int counter = 0; counter < score.length; counter++){
		System.out.print("Enter student " + (counter + 1) + ":");
		System.out.println();

		for(int index = 0; index < score[counter].length; index++){
			System.out.print("Enter subjects " + (index + 1) + ":");
			System.out.println();
			
			score[counter][index] = input.nextInt();
			
	  	}
	}

	for(int student = 0; student < score.length; student ++) {
		
		
		for(int subject = 0; subject < score[student].length; subject ++) {
			sum += score[student][subject];
		}

		scores = sum / studentNumber;
		average[student] = scores;
		total[student] = sum;
		sorting[student] = sum;
	}

	Arrays.sort(sorting);
	for(int numb = 0; numb < sorting.length; numb ++) {
		for(int index = 0; index < sorting.length; index ++) {
			if(sorting[numb] == total[index])
				positioning[numb] = sorting.length- index;
		}
	}
	  

	System.out.println();
	System.out.println();
	System.out.printf("\t\n%s", "STUDENT");
	for(int count = 0; count < numberOfSubject + 1; count ++) {
		System.out.printf("\t%s", "SUBJECTS" + (count +1));
	}

	System.out.println();
	System.out.printf("\t%s \t%s \t%s%n", " TOTAL ", " AVERAGE ", " POSITION ");
	System.out.println("==========================================================");
	System.out.println();
	

	for(int counting = 0; counting < studentNumber; counting ++){
		System.out.printf("Student %d ", counting + 1);
		
		for(int number = 0; number < numberOfSubject; number ++) {
			System.out.printf("\t%d", score[counting][number]);
		}

		System.out.printf("%d  %.2f  %d", total[counting], average[counting], positioning[counting]);
		System.out.println();
	}

	System.out.println();
	System.out.println("===============================================================");
	System.out.println();
	System.out.println("================================================================");
	System.out.println();

	}
}