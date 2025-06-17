import java.util.Scanner;

public class prob9_IsFirstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isSmallest = a < b && a < c;
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}