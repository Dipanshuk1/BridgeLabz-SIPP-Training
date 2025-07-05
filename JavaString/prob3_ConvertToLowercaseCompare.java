import java.util.Scanner;

public class prob3_ConvertToLowercaseCompare {

    static String toLowerCustom(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();
        String customLower = toLowerCustom(input);
        String builtInLower = input.toLowerCase();
        boolean areEqual = compareStrings(customLower, builtInLower);
        System.out.println("Are custom and built-in lowercase equal? " + areEqual);
    }
}
