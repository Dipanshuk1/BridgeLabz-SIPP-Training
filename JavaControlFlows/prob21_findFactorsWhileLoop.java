import java.util.Scanner;

public class prob21_findFactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        int counter = 1;
        System.out.println("Factors of " + number + " are:");
        while (counter <= number) {
            if (number % counter == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}