public class MergeTwoSortedArrays {
//? https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
static void merge(int[] nums1, int[] nums2, int n, int m){
    //* n + m will be size of nums1 
    //* m is the size of nums2
    m--;
    n--;
    int k = m + n - 1;
    while(m >= 0 && n >= 0){
        if(nums1[m] >nums2[n]){
            nums1[k] = nums1[m];
            k--;
            m--;
        }

        else{
            nums1[k] = nums2[n];
            k--;
            n--;
        }
    }

    while(m >= 0){
        nums1[k] = nums2[m];
        k--; m--;
    }

    while(n >= 0){
        nums1[k] = nums1[n];
        k--; n--;
    }

}    
}
