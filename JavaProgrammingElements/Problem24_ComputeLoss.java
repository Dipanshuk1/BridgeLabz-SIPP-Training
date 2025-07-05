import java.util.Scanner;

public class Problem24_ComputeLoss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double cp = input.nextDouble();
        System.out.print("Enter selling price: ");
        double sp = input.nextDouble();

        double loss = cp - sp;
        System.out.println("The loss is INR " + loss);
    }
}