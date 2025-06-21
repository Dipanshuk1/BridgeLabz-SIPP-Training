import java.util.Random;

public class prob16_VotingEligibility {
    static int[] genAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = r.nextInt(90) + 10;
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] out = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            String can;
            if (ages[i] < 0) can = "false";
            else can = ages[i] >= 18 ? "true" : "false";
            out[i][0] = String.valueOf(ages[i]);
            out[i][1] = can;
        }
        return out;
    }

    static void display(String[][] arr) {
        System.out.printf("%-4s %-6s %-10s%n", "No", "Age", "CanVote");
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%-4d %-6s %-10s%n", i + 1, arr[i][0], arr[i][1]);
    }

    public static void main(String[] args) {
        int[] ages = genAges(10);
        String[][] res = checkVoting(ages);
        display(res);
    }
}
