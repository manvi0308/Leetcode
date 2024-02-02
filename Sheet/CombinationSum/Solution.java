package Sheet.CombinationSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /*
     * Here any number can be used unlimited number of times.
     */
    static void combinationSumRecur(int[] arr, int target, List<List<Integer>> res, int index, List<Integer> ds) {
        // ^ Base cases
        if (index == arr.length) {
            if (target == 0) {
                res.add(ds);
            }

            return;
        }

       // Pick case
        if (arr[index] <= target) {
            ds.add(arr[index]);
            combinationSumRecur(arr, target - arr[index], res, index, ds);
            ds.remove(ds.size() - 1); // & Backtracking
        }

        // not pick case
        combinationSumRecur(arr, target, res, index + 1, ds);

    }

    static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int index = 0;
        // recursive function call
        combinationSumRecur(arr, target, res, index, ds);
        return res;
    }
}
