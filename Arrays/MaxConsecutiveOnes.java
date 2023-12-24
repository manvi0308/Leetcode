public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int st = -1, end = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && st == -1) {
                st = i;
                end = i;
            }

            else if (nums[i] == 1 && st != -1) {
                end = i;
                res = Math.max(res, end - st + 1);
            }

            else if (nums[i] == 0) {
                res = Math.max(res, end - st + 1);

            }
        }
        return res;
    }
}
