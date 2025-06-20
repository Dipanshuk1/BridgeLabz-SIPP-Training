import java.util.Scanner;

public class prob11_triangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of triangular park (in meters): ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c);
        System.out.println("Rounds to complete 5km: " + rounds);
    }

    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter);
    }
}