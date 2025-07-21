import java.util.Scanner;

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] scores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) scores[i] = sc.nextInt();

        selectionSort(scores);

        System.out.println("Sorted Exam Scores:");
        for (int s : scores) System.out.print(s + " ");
    }
}
