/*
https://takeuforward.org/data-structure/longest-increasing-subsequence-dp-41/
 */

public class LIS{
    static int getLISMemo(int[] arr, int n, int i, int prev_index, int[][] dp){
        if(i == n)
            return 0;

        if(dp[i][prev_index] != -1)
            return dp[i][prev_index];

        int notTake = 0 + getLISMemo(arr, n, i + 1, prev_index, dp);
        int take = 0;

        if(prev_index == -1 || arr[i] > arr[prev_index]){
            take = 1 + getLISMemo(arr, n, i + 1, i, dp);
        }

        dp[i][prev_index + 1] = Math.max(take, notTake);

        return dp[i][prev_index + 1];
    }
    static int getLIS(int[] arr, int n){
        int[][] dp = new int[n][n +1];

        for(int[] row : dp){
            Arrays.fill(dp, -1);
        }

        return  getLISMemo(arr, n, 0, -1, dp);
        // 0 is starting index and -1 is prev_index
    }
}