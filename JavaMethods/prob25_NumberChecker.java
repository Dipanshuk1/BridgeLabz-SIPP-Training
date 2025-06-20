import java.util.Scanner;

public class prob25_NumberChecker {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findTwoLargest(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        return new int[]{max, second};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        return new int[]{min, second};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = getDigits(number);

        System.out.println("Total Digits: " + countDigits(number));
        System.out.println("Duck Number? " + isDuckNumber(digits));
        System.out.println("Armstrong Number? " + isArmstrong(number));

        int[] largest = findTwoLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findTwoSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);

        sc.close();
    }
}
