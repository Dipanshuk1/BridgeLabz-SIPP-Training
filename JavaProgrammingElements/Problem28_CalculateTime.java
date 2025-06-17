import java.util.Scanner;

public class Problem28_CalculateTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double distance = input.nextDouble();
        System.out.print("Enter speed in m/s: ");
        double speed = input.nextDouble();

        double time = distance / speed;
        System.out.println("Time taken is " + time + " seconds");
    }
}