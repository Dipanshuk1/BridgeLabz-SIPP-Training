import java.util.Scanner;

public class Problem19_RectangleAreaFromDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of rectangle: ");
        double base = input.nextDouble();
        System.out.print("Enter diagonal of rectangle: ");
        double diagonal = input.nextDouble();

        double height = Math.sqrt((diagonal * diagonal) - (base * base));
        double area = base * height;

        System.out.println("Area of the rectangle is " + area + " when base is " + base + " and diagonal is " + diagonal);
    }
}