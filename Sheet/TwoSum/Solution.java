package Sheet.TwoSum;

import java.util.HashMap;

public class Solution {
    static boolean twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int y = target - x;
            if (hMap.containsKey(y)) {
                return true;
            }

            else {
                hMap.put(arr[i], i);
            }
        }

        return false;
    }
}
