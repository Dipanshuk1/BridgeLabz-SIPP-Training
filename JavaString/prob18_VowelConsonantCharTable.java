import java.util.Scanner;

public class prob18_VowelConsonantCharTable {
    static String charType(char ch) {
        char c = ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch;
        if (c >= 'a' && c <= 'z')
            return "aeiou".indexOf(c) >= 0 ? "Vowel" : "Consonant";
        return "Not a Letter";
    }

    static String[][] mapTypes(String s) {
        String[][] out = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            out[i][0] = String.valueOf(s.charAt(i));
            out[i][1] = charType(s.charAt(i));
        }
        return out;
    }

    static void display(String[][] arr) {
        System.out.printf("%-4s %-6s %-12s%n", "No", "Char", "Type");
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%-4d %-6s %-12s%n", i + 1, arr[i][0], arr[i][1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        String[][] table = mapTypes(s);
        display(table);
    }
}
