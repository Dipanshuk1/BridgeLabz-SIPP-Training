import java.util.Scanner;

public class prob1_SubstringComparer {
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String customSub = customSubstring(input, start, end);
        System.out.println("Custom Substring (charAt): " + customSub);

        String builtinSub = "";
        if (start >= 0 && end <= input.length() && start < end) {
            builtinSub = input.substring(start, end);
            System.out.println("Built-in Substring: " + builtinSub);
        } else {
            System.out.println("Invalid range for built-in substring.");
        }

        boolean isEqual = compareStrings(customSub, builtinSub);
        System.out.println("Are substrings equal? " + isEqual);
    }
}
