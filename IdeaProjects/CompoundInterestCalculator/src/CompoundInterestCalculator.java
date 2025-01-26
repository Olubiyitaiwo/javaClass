import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CompoundInterestCalculator {
    static Scanner input = new Scanner(System.in);
   static double principal = 0;
   static double monthlyContribution = 0;
    static int lengthOfYear = 0;
    static float interestRate = 0;
    static double interest = 0;
    static double compoundInterest = 0;
    public static void main(String[] args) {

    }
    public static double principal(double principal) {
        System.out.print("Enter initial Investment: ");
        principal = input.nextDouble();
        return principal;
    }
    public static double monthlyContribution(int numberOfMonths){
            System.out.print("Enter monthly Investment: ");
            double monthlyInvention = input.nextDouble();
        return monthlyInvention;
    }
    public static int lengthOfYear(){
        System.out.print("Enter length of year: ");
        int lenghtOfYear = input.nextInt();
        return lenghtOfYear;
    }
    public static float interestRate(){
        System.out.print("Enter interest rate: ");
        float interestRate =  input.nextFloat();
        return interestRate;
    }
    public static double interest(){
        interest = principal * Math.pow(1 + interestRate(), lengthOfYear());
        return interest;
    }
    public static double compoundInterest(){
        compoundInterest = principal * Math.pow(1 + interestRate(), lengthOfYear());
    }
}