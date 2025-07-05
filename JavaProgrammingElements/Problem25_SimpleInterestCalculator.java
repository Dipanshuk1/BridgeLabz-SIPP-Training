import java.util.Scanner;

public class Problem25_SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = input.nextDouble();
        System.out.print("Enter rate: ");
        double r = input.nextDouble();
        System.out.print("Enter time in years: ");
        double t = input.nextDouble();

        double si = (p * r * t) / 100;
        System.out.println("Simple Interest is INR " + si);
    }
}