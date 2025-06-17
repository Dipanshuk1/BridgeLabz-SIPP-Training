import java.util.Scanner;

public class prob40_harshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of digits
        while (number > 0) {
            int digit = number % 10; // get last digit
            sum += digit;            // add digit to sum
            number = number / 10;    // remove last digit
        }

        // Check if number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        scanner.close();
    }
}