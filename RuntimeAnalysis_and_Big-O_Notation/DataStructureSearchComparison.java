import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        
        int[] sizes = {1_000, 100_000, 1_000_000};

        Random rand = new Random();


        for (int n : sizes) {

            int[] array = rand.ints(n, 0, n * 10).toArray();

            HashSet<Integer> hashSet = new HashSet<>();

            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int num : array) {
                hashSet.add(num);
                treeSet.add(num);
            }
            int target = array[rand.nextInt(n)];

            long t1 = System.nanoTime();

            for (int i : array) if (i == target) break;
            long t2 = System.nanoTime();

            hashSet.contains(target);
            long t3 = System.nanoTime();

            treeSet.contains(target);
            long t4 = System.nanoTime();


            System.out.printf("Size: %,d | Array: %.3f ms | HashSet: %.3f ms | TreeSet: %.3f ms\n",
                    n, (t2 - t1) / 1e6, (t3 - t2) / 1e6, (t4 - t3) / 1e6);
        }
    }
}