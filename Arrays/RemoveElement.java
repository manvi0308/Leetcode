public class RemoveElement {
    //? 27. Remove Element

    //^ Intution is since we have to place the elements in place in the start 
    //^ of array, where none of the element should be equal to val. Or in simple
    //^ terms, the val elements should be placed at end. 

    //& start = 0, end = n - 1
    //& If a[start] != val, so it should be as it is and start ++
    //& If a[end] == val, then also its the desired order, end--

    //* Other cases
    //* a[start] == val || a[end] != val, in any of these two cases we have to swap starting
    //* and ending index.
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
