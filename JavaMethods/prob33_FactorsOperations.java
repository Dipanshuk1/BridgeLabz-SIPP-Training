import java.util.Arrays;

public class prob33_FactorsOperations {

    public static void main(String[] args) {
        int number = 12;

        int[] factors = getFactors(number);

        System.out.println("Factors of " + number + ": " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + getGreatestFactor(factors));
        System.out.println("Sum of Factors: " + getSumOfFactors(factors));
        System.out.println("Product of Factors: " + getProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + getProductOfCubes(factors));
    }

    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int i : factors) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int getSumOfFactors(int[] factors) {
        int sum = 0;
        for (int i : factors) {
            sum += i;
        }
        return sum;
    }

    public static long getProductOfFactors(int[] factors) {
        long product = 1;
        for (int i : factors) {
            product *= i;
        }
        return product;
    }

    public static long getProductOfCubes(int[] factors) {
        long product = 1;
        for (int i : factors) {
            product *= Math.pow(i, 3);
        }
        return product;
    }
}
