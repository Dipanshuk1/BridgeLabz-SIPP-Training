import java.util.Random;

public class prob11_StudentGrades {
    static int[][] genMarks(int n) {
        Random r = new Random();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                marks[i][j] = 10 + r.nextInt(90);
        return marks;
    }

    static double[][] calcStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int tot = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = tot / 3.0;
            double pct = Math.round((avg / 100) * 10000.0) / 100.0;
            stats[i] = new double[]{tot, Math.round(avg * 100.0) / 100.0, pct};
        }
        return stats;
    }

    static String[] grade(int[][] marks) {
        int n = marks.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double pct = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = pct >= 90 ? "A" : pct >= 80 ? "B" : pct >= 70 ? "C" :
                        pct >= 60 ? "D" : "F";
        }
        return grades;
    }

    static void display(int[][] marks, double[][] stats, String[] grades) {
        System.out.printf("%-4s %8s %8s %8s %6s %6s %9s %6s%n",
           "No", "Phys", "Chem", "Math", "Tot", "Avg", "Percent", "Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-4d %8d %8d %8d %6.0f %6.2f %9.2f %6s%n",
                i + 1,
                marks[i][0], marks[i][1], marks[i][2],
                stats[i][0], stats[i][1], stats[i][2],
                grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] marks = genMarks(5);
        double[][] stats = calcStats(marks);
        String[] grades = grade(marks);
        display(marks, stats, grades);
    }
}
