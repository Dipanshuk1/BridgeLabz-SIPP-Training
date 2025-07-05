import java.util.Scanner;

public class prob13_recursiveSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a positive natural number.");
            return;
        }

        int sumRec = recursiveSum(n);
        int sumFormula = formulaSum(n);

        System.out.println("Recursive Sum: " + sumRec);
        System.out.println("Formula Sum: " + sumFormula);
        System.out.println("Are both equal? " + (sumRec == sumFormula));
    }

    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
}