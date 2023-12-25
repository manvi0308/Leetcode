package LongestIncreasingSubSequence.PrintingSubSeq;

import java.util.ArrayList;
import java.util.Collections;

public class PrintingSubSeqUsingPowerSet {
    // ?
    // https://takeuforward.org/data-structure/power-set-print-all-the-possible-subsequences-of-the-string/
    static ArrayList<String> printSubSeq(String s) {
        int n = s.length();
        ArrayList<String> arr = new ArrayList<String>();
        // ^ No of possible subseq = 2^n - 1, excluding the empty space.
        // ^ Power set approach
        for (int num = 0; num < (1 << n); num++) {
            String temp = "";
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    temp += s.charAt(i);
                }
            }

            if (temp.length() > 0) {
                arr.add(temp);
            }
        }

        Collections.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        String s = "abcd";
        System.out.println((printSubSeq(s)));
    }
}
