public class FindFirstAndLast{
public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        int[] res = new int[2];
        res[0] = first;
        res[1] = last;

        return res;
    }

    static int findFirst(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
               res = mid;
               high  = mid - 1;
            }

            else if(nums[mid] < target){
            low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return res;
    }

    static int findLast(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
               res = mid;
               low = mid + 1;
            }

            else if(nums[mid] < target){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }

        return res;
    }
}