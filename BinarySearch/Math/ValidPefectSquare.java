package BinarySearch.Math;

public class ValidPefectSquare {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;

        int low = 0, high = num;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid >= num / mid) {
                high = mid;
            }

            else {
                low = mid + 1;
            }
        }

        return low * low == num;
    }
}
