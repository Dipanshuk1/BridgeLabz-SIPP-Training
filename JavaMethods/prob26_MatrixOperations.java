import java.util.Random;

public class prob26_MatrixOperations {
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); // values 0 to 9
        return matrix;
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%6.2f ", val);
            System.out.println();
        }
    }
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];
        return transpose;
    }
    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inverse = {
            { m[1][1] / det, -m[0][1] / det },
            { -m[1][0] / det, m[0][0] / det }
        };
        return inverse;
    }
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;
        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;
        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    public static void main(String[] args) {
        System.out.println("2x2 Matrix:");
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix2x2));

        double det2x2 = determinant2x2(matrix2x2);
        System.out.printf("\nDeterminant: %.2f\n", det2x2);

        System.out.println("\nInverse:");
        double[][] inv2x2 = inverse2x2(matrix2x2);
        if (inv2x2 != null)
            displayMatrix(inv2x2);
        else
            System.out.println("Matrix is singular (non-invertible).");

        System.out.println("\n3x3 Matrix:");
        double[][] matrix3x3 = createRandomMatrix(3, 3);
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose:");
        displayMatrix(transposeMatrix(matrix3x3));

        double det3x3 = determinant3x3(matrix3x3);
        System.out.printf("\nDeterminant: %.2f\n", det3x3);

        System.out.println("\nInverse:");
        double[][] inv3x3 = inverse3x3(matrix3x3);
        if (inv3x3 != null)
            displayMatrix(inv3x3);
        else
            System.out.println("Matrix is singular (non-invertible).");
    }
}
