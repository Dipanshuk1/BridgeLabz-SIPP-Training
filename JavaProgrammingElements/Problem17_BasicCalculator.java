import java.util.Scanner;

public class Problem17_BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double add = num1 + num2;
        double subtract = num1 - num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + ", " + subtract + ", " + multiply + ", and " + divide);
    }
}