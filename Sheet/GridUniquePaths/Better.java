package Sheet.GridUniquePaths;

import java.util.Arrays;

public class Better {
    static int countPaths(int i, int j, int n, int m, int[][] dp) {
        if (i == (n - 1) && j == (m - 1))
            return 1;
        if (i >= n || j >= m) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        else
        return dp[i][j] = countPaths(i + 1, j, n, m, dp) + countPaths(i, j + 1, n, m, dp);
    }

    // & memoized form of recursive solution
    static int gridUniquePaths(int n, int m) {
        int[][] dp = new int[n][m];
        Arrays.fill(dp, -1);
        int num = countPaths(0, 0, n, m, dp);
        if (m == 1 || n == 1)
            return num;
        return dp[0][0];
    }
}
