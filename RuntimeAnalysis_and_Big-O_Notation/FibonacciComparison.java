public class FibonacciComparison {
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return n == 0 ? 0 : b;
    }

    public static void main(String[] args) {
        int[] nums = {10, 30, 50};

        for (int n : nums) {
            long t1 = System.nanoTime();
            if (n <= 30) fibonacciRecursive(n);
            long t2 = System.nanoTime();

            long t3 = System.nanoTime();
            fibonacciIterative(n);
            long t4 = System.nanoTime();

            System.out.printf("N: %d | Recursive: %s ms | Iterative: %.5f ms\n",
                    n, n > 30 ? "Too slow" : String.format("%.5f", (t2 - t1) / 1e6),
                    (t4 - t3) / 1e6);
        }
    }
}