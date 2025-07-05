import java.util.Scanner;

public class prob12_StringLengthWithoutLength {
    static int strLength(String s) {
        int count = 0;
        while (true) {
            try {
                s.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e) {
                return count;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        int manual = strLength(s);
        int builtin = s.length();
        System.out.println("Manual length: " + manual);
        System.out.println("Built‑in length: " + builtin);
    }
}
