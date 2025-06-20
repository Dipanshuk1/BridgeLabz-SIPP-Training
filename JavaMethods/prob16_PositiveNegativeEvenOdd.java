import java.util.Scanner;

public class Question16_PositiveNegativeEvenOdd {
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a < b) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.println(num + " is Positive and " + (isEven(num) ? "Even" : "Odd"));
            } else {
                System.out.println(num + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 0) {
            System.out.println("First and last numbers are equal.");
        } else if (result > 0) {
            System.out.println("First number is greater than last.");
        } else {
            System.out.println("First number is less than last.");
        }

        sc.close();
    }
}
