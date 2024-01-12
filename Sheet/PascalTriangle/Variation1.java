package Sheet.PascalTriangle;
public class Variation1 {
    /*
     * Variation 1: Given row number r and column number c. Print the element at
     * position (r, c) in Pascal’s triangle.
     * 
     */
    static long nCr(int n, int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    static int pascalTriangle(int r, int c) {
        int res = (int) nCr(r - 1, c - 1); // 0 based indexing
        return res;
    }
}
