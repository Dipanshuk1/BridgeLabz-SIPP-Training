import java.util.Scanner;

public class prob19_SplitAndCompareWithBuiltIn {
    static int strLength(String s) {
        int c = 0;
        while (true) {
            try { s.charAt(c); c++; }
            catch (IndexOutOfBoundsException e) { break; }
        }
        return c;
    }

    static String[] splitWords(String s) {
        int n = strLength(s);
        java.util.List<String> words = new java.util.ArrayList<>();
        String w = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != ' ') w += c;
            else if (!w.isEmpty()) { words.add(w); w = ""; }
        }
        if (!w.isEmpty()) words.add(w);
        return words.toArray(new String[0]);
    }

    static boolean compareArr(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] custom = splitWords(s);
        String[] built = s.split(" ");
        System.out.println("Match? " + compareArr(custom, built));
    }
}
