import java.util.Scanner;

public class prob10_numberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = checkNumber(n);
        System.out.println("Result: " + result);
    }

    public static int checkNumber(int n) {
        if (n > 0) return 1;
        else if (n < 0) return -1;
        else return 0;
    }
}