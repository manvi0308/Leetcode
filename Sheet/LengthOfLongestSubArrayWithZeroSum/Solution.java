package Sheet.LengthOfLongestSubArrayWithZeroSum;

import java.util.HashMap;

public class Solution {
    static int maxLen(int[] arr) {
        int res = 0;
        int sum = 0;
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                res = i + 1;
            }

            else {
                if (hMap.get(sum) != null) {
                    res = Math.max(res, i - hMap.get(sum));
                }

                else {
                    hMap.put(sum, i);
                }
            }
        }
        return res;
    }
}
