import java.util.*;

public class SortComparison {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)

            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {

                    int t = arr[j];
                    arr[j] = arr[j + 1];

                    arr[j + 1] = t;
                }
    }

    static void mergeSort(int[] arr) {
        if (arr.length < 2) return;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);

        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);

        mergeSort(right);

        merge(arr, left, right);
    }

    static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length)

            arr[k++] = left[i] <= right[j] ? left[i++] : right[j++];

        while (i < left.length) arr[k++] = left[i++];

        while (j < right.length) arr[k++] = right[j++];
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10_000};
        Random rand = new Random();

        for (int n : sizes) {

            int[] a = rand.ints(n, 0, n * 10).toArray();

            int[] b = Arrays.copyOf(a, a.length);

            int[] c = Arrays.copyOf(a, a.length);

            long t1 = System.nanoTime();
            bubbleSort(a);
            long t2 = System.nanoTime();
            mergeSort(b);
            long t3 = System.nanoTime();
            Arrays.sort(c);
            long t4 = System.nanoTime();

            System.out.printf("Size: %,d | Bubble: %.1f ms | Merge: %.1f ms | Quick: %.1f ms\n",
                    n, (t2 - t1) / 1e6, (t3 - t2) / 1e6, (t4 - t3) / 1e6);
        }
        
    }

}

