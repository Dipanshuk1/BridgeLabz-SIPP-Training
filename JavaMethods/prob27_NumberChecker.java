public class prob27_NumberChecker {

    public static void main(String[] args) {
        int[] testNumbers = {6, 12, 8, 145, 10}; 

        for (int number : testNumbers) {
            System.out.println("Number: " + number);
            System.out.println("Is Perfect? " + isPerfect(number));
            System.out.println("Is Abundant? " + isAbundant(number));
            System.out.println("Is Deficient? " + isDeficient(number));
            System.out.println("Is Strong? " + isStrong(number));
            System.out.println("----------------------------");
        }
    }

    public static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    public static boolean isStrong(int number) {
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == original;
    }

    private static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}
