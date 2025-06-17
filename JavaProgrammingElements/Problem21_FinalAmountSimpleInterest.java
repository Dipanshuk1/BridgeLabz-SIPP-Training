import java.util.Scanner;

public class Problem21_FinalAmountSimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Enter time in years: ");
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;
        double amount = principal + interest;

        System.out.println("The Final amount after SI is INR " + amount);
    }
}