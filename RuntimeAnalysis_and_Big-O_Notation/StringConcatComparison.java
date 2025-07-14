public class StringConcatComparison {
    public static void main(String[] args) {
        int[] sizes = {1_000, 10_000, 1_000_000};

        for (int n : sizes) {
            long t1 = System.nanoTime();

            String s = "";
            for (int i = 0; i < n; i++) s += "a";

            long t2 = System.nanoTime();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) sb.append("a");

            long t3 = System.nanoTime();
            StringBuffer sbf = new StringBuffer();

            for (int i = 0; i < n; i++) sbf.append("a");

            long t4 = System.nanoTime();

            System.out.printf("N: %,d | String: %.1f ms | StringBuilder: %.1f ms | StringBuffer: %.1f ms\n",      
                    n, (t2 - t1) / 1e6, (t3 - t2) / 1e6, (t4 - t3) / 1e6);
        }
    }
}