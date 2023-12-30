package Sheet.MaxSubArraySum;

public class Better {
    static void maxSum(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxSum = Math.max(sum, maxSum);
            }
        }

        System.out.println(maxSum);
    }
}
