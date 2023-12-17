// https://leetcode.com/problems/search-insert-position/?envType=study-plan-v2&envId=binary-search
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;

            else if (nums[mid] < target) {
                // it could either be on right half, could be mid + 1 as well.
                if (nums[mid + 1] > target)
                    return mid + 1;
                else {
                    left = mid + 1;
                }
            }

            else {
                // it could either be on left half, or mid - 1 or the very first position as
                // well.
                if ((mid - 1) != -1 && nums[mid - 1] < target) {
                    return mid;
                }

                else if ((mid - 1) == 0)
                    return 0;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }
}
