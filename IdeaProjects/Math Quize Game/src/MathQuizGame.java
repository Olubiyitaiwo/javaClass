import java.util.Random;
import java.util.Scanner;

public class MathQuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOne, numberTwo, questions;
        for (int count = 0; count < 10; count++) {
            char[] operations = {'+', '-', '*', '/'};
            Random rand = new Random();
            numberOne = rand.nextInt(21);
            numberTwo = rand.nextInt(21);

            System.out.println("What is: " + numberOne + " " + operations[count] + " " + numberTwo);
            double answer = input.nextDouble();
            if (operations[count] == answer) {
                System.out.println("You answered " + operations[count]);
                System.out.println("You are correct!");
                if(operations[count] != answer) {
                    System.out.println("You are not correct!");
                }
            }

        }
    }
}