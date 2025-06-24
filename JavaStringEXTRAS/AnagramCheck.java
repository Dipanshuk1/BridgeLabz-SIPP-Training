import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] a1 = s1.toLowerCase().toCharArray();
        char[] a2 = s2.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}
