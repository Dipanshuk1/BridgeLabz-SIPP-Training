import java.util.Scanner;

public class prob5_IllegalArgumentException {

    static void generateException(String input) {
        System.out.println(input.substring(5, 2));
    }

    static void handleException(String input) {
        try {
            System.out.println(input.substring(5, 2));
        } catch (IllegalArgumentException | StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        handleException(input);
    }
}
