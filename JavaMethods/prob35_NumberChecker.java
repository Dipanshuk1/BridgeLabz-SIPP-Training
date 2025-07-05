public class prob35_NumberChecker {

    public static void main(String[] args) {
        int number = 7;

        System.out.println("Number: " + number);
        System.out.println("Is Prime? " + NumberChecker.isPrime(number));
        System.out.println("Is Neon? " + NumberChecker.isNeon(number));
        System.out.println("Is Spy? " + NumberChecker.isSpy(number));
        System.out.println("Is Automorphic? " + NumberChecker.isAutomorphic(number));
        System.out.println("Is Buzz? " + NumberChecker.isBuzz(number));
    }
}

class NumberChecker {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1, digit;
        int temp = num;
        while (temp > 0) {
            digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    public static boolean isBuzz(int num) {
        return (num % 7 == 0 || num % 10 == 7);
    }
}
