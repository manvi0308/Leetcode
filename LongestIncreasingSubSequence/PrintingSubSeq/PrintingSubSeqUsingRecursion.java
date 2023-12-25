package LongestIncreasingSubSequence.PrintingSubSeq;

public class PrintingSubSeqUsingRecursion {
    //! Pick/ Not pick concept
    static void solve(String s, String f, int i){
        // f is an empty string and i is 0
        if(i == s.length())
        System.out.println(f + " ");
        
        // picking 
        solve(s, f + s.charAt(i), i);
        // not picking 
        solve(s, f, i + 1);
    }
}
