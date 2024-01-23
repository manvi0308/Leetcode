package Sheet.FindDuplicates;

public class Solution {

    static int findDuplicates(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
