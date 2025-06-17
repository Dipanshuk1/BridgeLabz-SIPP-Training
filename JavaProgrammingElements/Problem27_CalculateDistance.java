import java.util.Scanner;

public class Problem27_CalculateDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed in m/s: ");
        double speed = input.nextDouble();
        System.out.print("Enter time in seconds: ");
        double time = input.nextDouble();

        double distance = speed * time;
        System.out.println("Distance is " + distance + " meters");
    }
}