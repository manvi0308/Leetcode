import java.util.*;

public class FindRightInterval {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] res = new int[n];
        NavigableMap<Integer, Integer> startToIndexMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            startToIndexMap.put(intervals[i][0], i);
        }

        for (int i = 0; i < n; i++) {
            Map.Entry<Integer, Integer> entry = startToIndexMap.ceilingEntry(intervals[i][i]);
            if (entry == null)
                res[i] = -1;
            else
                res[i] = entry.getValue();
        }

        return res;
    }
}