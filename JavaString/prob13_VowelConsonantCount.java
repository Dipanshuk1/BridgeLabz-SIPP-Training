import java.util.Scanner;

public class prob13_VowelConsonantCount {
    static String charType(char ch) {
        char c = ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch;
        if (c >= 'a' && c <= 'z') {
            return "aeiou".indexOf(c) >= 0 ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    static int[] countVC(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String t = charType(s.charAt(i));
            if (t.equals("Vowel")) v++;
            else if (t.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();
        int[] cnt = countVC(s);
        System.out.println("Vowels = " + cnt[0] + ", Consonants = " + cnt[1]);
    }
}
