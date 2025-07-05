import java.util.Scanner;

public class prob7_ConvertToUppercaseCompare {

    static String toUpperCustom(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
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
        String customUpper = toUpperCustom(input);
        String builtInUpper = input.toUpperCase();
        boolean areEqual = compareStrings(customUpper, builtInUpper);
        System.out.println("Are custom and built-in uppercase equal? " + areEqual);
    }
}
