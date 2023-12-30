package Sheet.MaxSubArraySum;

public class Brute {
    static void maxSum(int[] arr){
        // brute force
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                    maxSum = Math.max(sum, maxSum);
                }
            }
        }

        System.out.println(maxSum);
    }
}
