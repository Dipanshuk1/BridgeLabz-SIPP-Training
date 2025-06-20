import java.util.Scanner;

public class prob30_StudentScoreCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcmScores = generateScores(n);
        double[][] results = calculateScoreDetails(pcmScores);

        displayScorecard(pcmScores, results);
    }

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 51 + 50); 
            scores[i][1] = (int) (Math.random() * 51 + 50); 
            scores[i][2] = (int) (Math.random() * 51 + 50); 
        }
        return scores;
    }

    public static double[][] calculateScoreDetails(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; 

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t");
            System.out.print((int) results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%\n");
        }
    }
}
