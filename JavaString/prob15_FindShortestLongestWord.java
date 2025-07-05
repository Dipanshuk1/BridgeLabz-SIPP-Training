import java.util.Scanner;

public class prob15_FindShortestLongestWord {
    static String[] splitWords(String s) {
        int n = s.length();
        java.util.List<String> list = new java.util.ArrayList<>();
        String w = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c != ' ') w += c;
            else if (!w.isEmpty()) { list.add(w); w = ""; }
        }
        if (!w.isEmpty()) list.add(w);
        return list.toArray(new String[0]);
    }

    static int strLength(String s) {
        int count = 0;
        while (true) {
            try { s.charAt(count); count++; }
            catch (IndexOutOfBoundsException e) { break; }
        }
        return count;
    }

    static String[][] wordLens(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(strLength(words[i]));
        }
        return arr;
    }

    static int[] findMinMaxLen(String[][] arr) {
        int min = Integer.MAX_VALUE, max = 0;
        for (String[] r : arr) {
            int len = Integer.parseInt(r[1]);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] wds = splitWords(text);
        String[][] wl = wordLens(wds);
        int[] mm = findMinMaxLen(wl);
        System.out.println("Words and lengths:");
        for (String[] r : wl) System.out.println(r[0] + " => " + r[1]);
        System.out.println("Shortest length: " + mm[0] + ", Longest length: " + mm[1]);
    }
}
