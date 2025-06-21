import java.util.Scanner;

public class prob14_RockPaperScissors {
    static String compChoice() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

    static String winner(String u, String c) {
        if (u.equals(c)) return "Draw";
        if (u.equals("rock") && c.equals("scissors") ||
            u.equals("paper") && c.equals("rock") ||
            u.equals("scissors") && c.equals("paper"))
            return "User";
        return "Computer";
    }

    static String[][] stats(String[][] results) {
        int games = results.length, uw = 0, cw = 0;
        for (String[] r : results) {
            if (r[2].equals("User")) uw++;
            else if (r[2].equals("Computer")) cw++;
        }
        double up = uw * 100.0 / games, cp = cw * 100.0 / games;
        String[][] out = new String[2][3];
        out[0] = new String[]{"User", String.valueOf(uw), String.format("%.2f%%", up)};
        out[1] = new String[]{"Computer", String.valueOf(cw), String.format("%.2f%%", cp)};
        return out;
    }

    static void display(String[][] results, String[][] st) {
        System.out.printf("%-5s %-10s %-10s %-10s%n", "No", "User", "Comp", "Winner");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-5d %-10s %-10s %-10s%n", i + 1,
                results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("\nStats:");
        System.out.printf("%-10s %-6s %-10s%n", "Player", "Wins", "Win %");
        for (String[] row : st) {
            System.out.printf("%-10s %-6s %-10s%n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of games: ");
        int n = sc.nextInt();
        String[][] res = new String[n][3];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String u = sc.next().toLowerCase();
            String c = compChoice();
            res[i] = new String[]{u, c, winner(u, c)};
        }
        String[][] st = stats(res);
        display(res, st);
    }
}
