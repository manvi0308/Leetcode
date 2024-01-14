import java.util.*;

public class LIS {
    static int findLIS(int[] array, int n) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(array[0]); // Initial configuration for temp array.
        int len = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] > temp.get(temp.size() - 1)) {
                temp.add(array[i]);
                len++;
            }

            else {
                // Replacement step
                int index = Collections.binarySearch(temp, array[i]);
                if (index < 0) {
                    index = -index - 1;
                }

                temp.set(index, array[i]);
            }
        }

        return len;

    }
}