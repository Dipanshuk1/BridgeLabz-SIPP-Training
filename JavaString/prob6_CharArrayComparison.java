import java.util.Scanner;

public class prob6_CharArrayComparison {

    static char[] toCharArrayCustom(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.next();
        char[] custom = toCharArrayCustom(input);
        char[] builtIn = input.toCharArray();
        boolean result = compareCharArrays(custom, builtIn);
        System.out.println("Are both character arrays equal? " + result);
    }
}
