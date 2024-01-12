package Sheet.MergeOverlappingInterval;

import java.util.*;

public class Solution {
    static List<List<Integer>> merge(int[][] intervals) {
        List<List<Integer>> res = new ArrayList<>();

        // sorting
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        // merging step
        for (int i = 0; i < intervals.length; i++) {
            // not merge
            if (res.isEmpty() || intervals[i][0] > res.get(res.size() - 1).get(1)) {
                res.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                res.get(res.size() - 1).set(1, Math.max(res.get(res.size() - 1).get(1), intervals[i][1]));
            }
        }
        return res;
    }
}