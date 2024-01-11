package Sheet.Sort0s1s2s;

public class DutchAlgo {
    static void sort012(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1; // Initial configuration
        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap low and mid and increment both
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;
            }

            else if (arr[mid] == 1) {
                mid++;
            }

            else {
                // swap mid and high and decrement high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
