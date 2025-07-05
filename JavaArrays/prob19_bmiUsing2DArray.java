import java.util.Scanner;

public class prob19_bmiUsing2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];

        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            double height;
            do {
                System.out.print("Enter height in meters (positive value): ");
                height = sc.nextDouble();
                if (height <= 0) System.out.println("Invalid height! Try again.");
            } while (height <= 0);

            double weight;
            do {
                System.out.print("Enter weight in kilograms (positive value): ");
                weight = sc.nextDouble();
                if (weight <= 0) System.out.println("Invalid weight! Try again.");
            } while (weight <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4)
                weightStatus[i] = "Underweight";
            else if (bmi <= 24.9)
                weightStatus[i] = "Normal";
            else if (bmi <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d:\n", (i + 1));
            System.out.printf("Height: %.2f m\n", personData[i][1]);
            System.out.printf("Weight: %.2f kg\n", personData[i][0]);
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}