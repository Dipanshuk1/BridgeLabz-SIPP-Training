import java.util.Scanner;

public class prob17_TrimStringCustom {
    static int[] findBounds(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j && s.charAt(i) == ' ') i++;
        while (j >= i && s.charAt(j) == ' ') j--;
        return new int[]{i, j};
    }

    static String subCustom(String s, int i, int j) {
        String res = "";
        for (int k = i; k <= j; k++) res += s.charAt(k);
        return res;
    }

    static boolean eqChars(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String s = sc.nextLine();
        int[] b = findBounds(s);
        String custom = subCustom(s, b[0], b[1]);
        String builtIn = s.trim();
        System.out.println("Custom trim matches built‑in? " + eqChars(custom, builtIn));
        System.out.println("Result: '" + custom + "'");
    }
}
