import java.util.Scanner;

public class PositiveOrNegative {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    }
        public static int positiveNumber(int[] numbers, int number1) {
            int positiveNumber = 0;
            numbers = new int[10];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    positiveNumber++;
                }

            }
            return positiveNumber;
        }
        public static int negativeNumber(int[] numbers, int number1) {
        int negativeNumber = 0;
        numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeNumber++;
            }
        }
        return negativeNumber;
        }
}