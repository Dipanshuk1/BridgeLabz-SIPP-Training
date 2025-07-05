import java.util.Scanner;

public class prob20_SplitWordsWithLengths {
    static String[] splitWords(String s) {
        java.util.List<String> list = new java.util.ArrayList<>();
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') w += c;
            else if (!w.isEmpty()) { list.add(w); w = ""; }
        }
        if (!w.isEmpty()) list.add(w);
        return list.toArray(new String[0]);
    }

    static int strLen(String s) {
        int c = 0;
        while (true) {
            try { s.charAt(c); c++; }
            catch (IndexOutOfBoundsException e) { break; }
        }
        return c;
    }

    static String[][] wordLens(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(strLen(words[i]));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] wds = splitWords(s);
        String[][] wl = wordLens(wds);
        System.out.printf("%-15s %-6s%n", "Word", "Length");
        for (String[] r : wl) {
            System.out.printf("%-15s %-6s%n", r[0], r[1]);
        }
    }
}
