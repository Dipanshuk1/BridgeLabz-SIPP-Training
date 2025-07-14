

import java.util.*;

public class SearchComparison {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10_000, 1_000_000};

        for (int size : datasetSizes) {
            int[] data = new int[size];

            Random rand = new Random();
            for (int i = 0; i < size; i++) {

                data[i] = rand.nextInt(size * 10);
            }

            int target = data[rand.nextInt(size)];

            long start = System.nanoTime();

            linearSearch(data, target);
            long end = System.nanoTime();

            double linearTimeMs = (end - start) / 1_000_000.0;
            Arrays.sort(data);

            start = System.nanoTime();
            binarySearch(data, target);

            end = System.nanoTime();
            double binaryTimeMs = (end - start) / 1_000_000.0;
            
            System.out.printf("Dataset Size: %,d | Linear Search: %.3f ms | Binary Search: %.3f ms\n",
                    size, linearTimeMs, binaryTimeMs);
        }
    }
}