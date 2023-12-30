package Sheet.NextPermutation;

import java.util.ArrayList;
import java.util.Collection;

public class PrintAllPermutation {
    static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void recur(int[] nums, int index, ArrayList<ArrayList<Integer>> res) {
        // ^ Base case
        if (index == nums.length) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }

            res.add(temp);
            return;

        }

        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recur(nums, index + 1, res);
            swap(i, index, nums); // backtaracking;
        }
    }

    static ArrayList<ArrayList<Integer>> printPermutation(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        recur(nums, 0, res);
        return res;
    }

   
}
