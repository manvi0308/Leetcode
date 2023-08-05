public class MajorityElement {
    static int majorityElement(int[] nums){
        //^ Simple application of Boyer's moore algo.
        //^ Intution is that on traversing the entire array, the ME frequency
        //^ will always be greater than 0, since it occurs N/2 times. So linearly
        //^ traversing the array, if current element is the candidate, increase freq, else decrease freq.
        //^ if at any point of time freq becomes 0, this means there has to be a diff ME.
        int count = 0;
        int candidate = nums[0];
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        //~ if the candidate with max votes is a majority element or not.
        //~ This if statement need to be add only if its explicitly mentioned
        //~ that the majority element may or may not exists.
        /* if(count >= nums.length/2){
            return candidate;
        }*/
        return candidate;
    }
}
