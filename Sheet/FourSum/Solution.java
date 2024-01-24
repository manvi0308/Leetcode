package Sheet.FourSum;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    static void fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            // avoid duplicates
            if (index > 0 && nums[index] == nums[index - 1]) {
                continue;
            }

            for (int j = index + 1; j < nums.length; j++) {
                // avoid duplicates
                if (j > index + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    int sum = nums[index] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[index]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);

                        res.add(temp);
                        k++;
                        l--;

                        // avoid duplicates
                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }

                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    }

                    else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }

            }
        }
    }
}
