package Sheet.SetMatrixZeroes;
import java.util.*;
public class Better {
    static void setZeroes(int[][] matrix, int rows, int cols) {
        int[] r = new int[rows];
        int[] c = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    r[i] = -1;
                    c[j] = -1;
                }
            }
        }

        // setting matrix to 0 now
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (r[i] == -1 || c[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix, matrix.length, matrix[0].length);
        for (int[] row : matrix){
                    System.out.println(Arrays.toString(row));
        }
    }
}
