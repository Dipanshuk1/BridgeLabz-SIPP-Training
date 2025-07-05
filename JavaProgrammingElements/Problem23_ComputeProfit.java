import java.util.Scanner;

public class Problem23_ComputeProfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double cp = input.nextDouble();
        System.out.print("Enter selling price: ");
        double sp = input.nextDouble();

        double profit = sp - cp;
        System.out.println("The profit is INR " + profit);
    }
}