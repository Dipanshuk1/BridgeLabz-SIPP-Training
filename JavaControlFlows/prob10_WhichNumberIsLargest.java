import java.util.Scanner;

public class prob10_WhichNumberIsLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Is the first number the largest? " + (a >= b && a >= c));
        System.out.println("Is the second number the largest? " + (b >= a && b >= c));
        System.out.println("Is the third number the largest? " + (c >= a && c >= b));
    }
}