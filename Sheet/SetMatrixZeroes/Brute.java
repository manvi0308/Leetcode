package Sheet.SetMatrixZeroes;

public class Brute {
    static void markRows(int[][] matrix, int i, int rows, int cols) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    static void markCols(int[][] matrix, int j, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            if (matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }

    static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    // set entire ith row to -1
                    markRows(matrix, i, rows, cols);

                    // set entire jth col to -1
                    markCols(matrix, j, rows, cols);
                }
            }
        }
    }
}
