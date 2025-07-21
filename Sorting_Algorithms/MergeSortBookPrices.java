import java.util.Scanner;

public class MergeSortBookPrices {

    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);
            merge(prices, left, mid, right);
        }
    }

    public static void merge(int[] prices, int left, int mid, int right) {
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];
        for (int i = 0; i < leftArr.length; i++) leftArr[i] = prices[left + i];
        for (int i = 0; i < rightArr.length; i++) rightArr[i] = prices[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) prices[k++] = leftArr[i++];
            else prices[k++] = rightArr[j++];
        }
        while (i < leftArr.length) prices[k++] = leftArr[i++];
        while (j < rightArr.length) prices[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) prices[i] = sc.nextInt();

        mergeSort(prices, 0, n - 1);

        System.out.println("Sorted Book Prices:");
        for (int p : prices) System.out.print(p + " ");
    }
}
