public class RemoveElement {
    static int removeElement(int[] nums, int val){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            if(nums[start] != val)
            {
                start++;
                continue;
            }

            if(nums[end] == val)
            {
                end--;
                continue;
            }

            // swap
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }

        return start;
    }
}
