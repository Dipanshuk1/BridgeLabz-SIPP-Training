import java.util.Scanner;

public class prob34_checkAbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 2: Get input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 3: Initialize sum
        int sum = 0;

        // Step 4: Find divisors and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Step 6 & 7: Check if it's an Abundant Number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }

        scanner.close();
    }
}