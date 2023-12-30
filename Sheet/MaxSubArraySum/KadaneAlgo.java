package Sheet.MaxSubArraySum;

public class KadaneAlgo {
    static int kadaneAlgo(int[] arr, int n){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;


        for(int i = 0; i < n; i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_ending_here < 0){
                max_ending_here = 0;
            }

            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        return max_so_far;
    }
}
