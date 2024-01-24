package Sheet.LongestConsecutiveSequence;

import java.util.Arrays;

public class Solution {
    static void lcs(int[] arr) {
        int n = arr.length;
        int lastSmaller = Integer.MIN_VALUE;
        int length = 1;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastSmaller) {
                count++;
            }

            else if (arr[i] != lastSmaller) {
                count = 1;
            }
            lastSmaller = arr[i];
            length = Math.max(length, count);
        }

        System.out.println(length);
    }
}
