public class MaxConsecutiveOnes{
    static int maxConsecutiveOnes(int[] arr, int n){
        int count = 0;
        int maxi = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                count = 0;
            }

            maxi = Math.max(maxi, count);
        }

        return maxi;
    }
}