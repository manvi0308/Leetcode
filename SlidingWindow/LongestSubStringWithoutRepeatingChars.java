package SlidingWindow;

public class LongestSubStringWithoutRepeatingChars {
    public int lengthOfLongestSubString(String s) {
        int n = s.length();
        if (n == 0)
            return 0;

        int left = 0;
        int right = 0;
        int ans = 0;
        boolean[] visited = new boolean[256];
        while (left < n && right < n) {
            if (visited[s.charAt(right)] == false) {
                visited[s.charAt(right)] = true;
                right++;
                ans = Math.max(ans, right - left + 1);
            }

            else {
                visited[s.charAt(right)] = false;
                left++;
            }
        }

        return ans;
    }
}
