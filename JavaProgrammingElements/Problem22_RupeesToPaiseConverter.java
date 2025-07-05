import java.util.Scanner;

public class Problem22_RupeesToPaiseConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        double rupees = input.nextDouble();
        int paise = (int)(rupees * 100);

        System.out.println("Rupees " + rupees + " = " + paise + " paise");
    }
}