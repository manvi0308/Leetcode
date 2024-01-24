public class Solution {
    static void swapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    static void merge(int[] a1, int[] a2) {
        int n = a1.length;
        int m = a2.length;

        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            if (left < n && right >= n) {
                // both pointers are in different array
                swapIfGreater(a1, a2, left, right - n);
            }

            else if (left >= n) {
                swapIfGreater(a1, a2, left - n, right);
            }

            else {
                swapIfGreater(a1, a2, left - n, right - n);
            }

            left++;
            right++;

            if (gap == 1)
                break;
        }

        gap = (gap / 2) + (gap % 2);
    }
}