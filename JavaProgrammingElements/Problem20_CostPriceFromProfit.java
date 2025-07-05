import java.util.Scanner;

public class Problem20_CostPriceFromProfit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter selling price: ");
        double sp = input.nextDouble();
        System.out.print("Enter profit percentage: ");
        double profitPercent = input.nextDouble();

        double cp = (sp * 100) / (100 + profitPercent);
        System.out.println("Cost price is INR " + cp + " for selling price INR " + sp + " with profit of " + profitPercent + "%");
    }
}
