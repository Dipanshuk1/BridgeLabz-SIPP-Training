import java.util.Scanner;

public class Problem26_CalculateSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double distance = input.nextDouble();
        System.out.print("Enter time in seconds: ");
        double time = input.nextDouble();

        double speed = distance / time;
        System.out.println("Speed is " + speed + " m/s");
    }
}