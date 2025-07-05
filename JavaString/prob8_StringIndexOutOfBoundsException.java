import java.util.Scanner;

public class prob8_StringIndexOutOfBoundsException {

    static void generateException(String input) {
        System.out.println(input.charAt(input.length())); 
    }

    static void handleException(String input) {
        try {
            System.out.println(input.charAt(input.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.next();
        handleException(input);
    }
}
