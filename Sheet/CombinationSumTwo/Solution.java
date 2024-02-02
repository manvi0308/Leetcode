package Sheet.CombinationSumTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    static List<List<Integer>> combinationSumTwo(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr); // ToDo Ask if array is already sorted or not.

        /*
         * Changing params
         * target
         * index
         * 
         * Same params
         * arr
         * 
         * ds is used to store each combination
         * res to store final result.
         */
        int index = 0;
        List<Integer> ds = new ArrayList<>();
        combinationSumTwoRecur(arr, target, index, ds, res);
        return res;
    }

    static void combinationSumTwoRecur(int[] arr, int target, int index, List<Integer> ds, List<List<Integer>> res) {

        if (target == 0) {
            res.add(ds);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                // ^ avoid duplicates
                continue;
            }

            if (arr[i] < target)
                break;

            ds.add(arr[i]);
            //^ recusrsive call for further indexes.
            combinationSumTwoRecur(arr, target - arr[i], index + 1, ds, res);
           
           //^ Backtracking
            ds.remove(ds.size() - 1);
        }
    }
}
