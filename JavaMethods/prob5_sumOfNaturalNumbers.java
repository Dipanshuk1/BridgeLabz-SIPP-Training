import java.util.Scanner;

public class prob5_sumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println("Sum = " + sum(n));
    }

    public static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) total += i;
        return total;
    }
}