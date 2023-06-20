import java.util.Arrays;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] TEST_MATRIX = {
                {-2, 31, 6, 7},
                {15, -42, 1, 0},
                {9, -7, 12, 19},
                {55, 34, 1, -10}
        };
        int[] matrixDiagonal = getDiagonal(TEST_MATRIX);
        int[] matrixCounterDiagonal = getCounterDiagonal(TEST_MATRIX);
        System.out.println(Arrays.toString(matrixDiagonal));
        System.out.println(Arrays.toString(matrixCounterDiagonal));
    }

    public static int[] getDiagonal(int[][] matrix) {
        int[] diagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    diagonal[i] = matrix[i][j];
                    break;
                }
            }
        }
        return diagonal;
    }

    public static int[] getCounterDiagonal(int[][] matrix) {
        int reverseIndex = matrix[0].length - 1;
        int[] counterDiagonal = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                if (j == reverseIndex) {
                    reverseIndex--;
                    counterDiagonal[i] = matrix[i][j];
                    break;
                }
            }
        }
        return counterDiagonal;
    }
}
