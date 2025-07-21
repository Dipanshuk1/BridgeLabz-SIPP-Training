import java.util.Scanner;

public class CountingSortStudentAges {

    public static void countingSort(int[] ages) {
        int min = 10, max = 18;
        int[] count = new int[max - min + 1];

        for (int age : ages) count[age - min]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) ages[index++] = i + min;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = new int[n];

        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) ages[i] = sc.nextInt();

        countingSort(ages);

        System.out.println("Sorted Ages:");
        for (int age : ages) System.out.print(age + " ");
    }
}
