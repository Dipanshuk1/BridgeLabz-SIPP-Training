import java.util.Scanner;

public class prob32_countDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;
        int temp = Math.abs(number);  // Handle negative numbers

        if (temp == 0) {
            count = 1;  // Zero has one digit
        } else {
            while (temp != 0) {
                temp /= 10;  // Remove last digit
                count++;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}