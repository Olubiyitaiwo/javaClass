import java.util.Arrays;
import java.util.Scanner;

public class Search {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    }
    public static int numbers() {
        int index = 0;
        int[] numbers = new int[10];
        for (int count = 0; count < numbers.length; count++) {
            System.out.print("Enter number: ");
            numbers[count] = input.nextInt();
            if (numbers[count] == 24) {
                index++;
                //System.out.println(Arrays.toString(numbers));
            }
            ;
        }
        return index;
    }

}