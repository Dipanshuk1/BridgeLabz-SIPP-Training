public class prob37_LineGeometry {

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept}; 
    }

    public static void main(String[] args) {
        double x1 = 2, y1 = 3;
        double x2 = 6, y2 = 11;
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Line Equation: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
}
