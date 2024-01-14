package Sheet.FindRepeatingMissing;

public class Solution {
    static int[] findRepeatingMissing(int[] nums){
        int n = nums.length;

        long SN = (n * (n + 1))/2;
        long S2N = (n * (n +  1) * (2* n+1))/6;
        
        long S = 0, S2 = 0;

        for(int i = 0; i <n; i++){
            S += nums[i];
            S2 += (long)nums[i] * (long)nums[i];
        }

        // X - Y
        long val1 = S - SN;

        // X2 - Y2 = S2 - S2N
        long val2 = S2 - S2N;

        val2 = val2/val1;

        // val1 = x - y and val2 = x + y
        long x = ( val1 + val2)/2;
        long y = x - val2;

        int[] ans = {(int)x, (int)y};
        return ans;

    }
}
