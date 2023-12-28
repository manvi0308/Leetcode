package Sheet.SetMatrixZeroes;

import java.util.Arrays;

public class Optimal {
    static void setZeroes(int[][] matrix, int rows, int cols){
        int col0 = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0 ){
                    matrix[i][0] = -1;

                    if(j != 0){
                        matrix[0][j] = -1;
                    }
                    else{
                        col0 = -1;
                    }
                }
            }
        }

        //! Mark from 1st row and 1st col
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                if(matrix[i][0] == -1 || matrix[0][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }

        //^ Mark 0th row and 0th col
        if(matrix[0][0] == -1){
            for(int j = 0; j < cols; j++){
                matrix[0][j] = 0;
            }
        }

        if(col0 == -1){
            for(int i = 0; i < rows; i++){
                matrix[i][0] = 0;
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
