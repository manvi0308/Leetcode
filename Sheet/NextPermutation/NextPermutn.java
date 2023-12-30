package Sheet.NextPermutation;

import java.util.*;

public class NextPermutn {
    public static List<Integer> nextGreaterPermutation(List<Integer> a) {
        int n = a.size();
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (a.get(i) < a.get(i + 1)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            Collections.reverse(a);
            return a;
        }

        for (int i = n - 1; i > index; i--) {
            if (a.get(i) > a.get(index)) {
                int tmp = a.get(index);
                a.set(i, a.get(index));
                a.set(index, tmp);
                break;
            }
        }

        // Step 3: reverse the right half:
        List<Integer> sublist = a.subList(index + 1, n);
        Collections.reverse(sublist);

        return a;
    }
}
