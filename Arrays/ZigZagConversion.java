public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s == null || numRows <= 0 || s.isEmpty()) {
            return "";
        }

        if (numRows == 1)
            return s;

        StringBuilder res = new StringBuilder();
        int steps = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += steps) {
                res.append(s.charAt(j));
                // diagonal wale elements
                if (i != 0 && i != numRows - 1 && (j + steps - 2 * i) < s.length()) {
                    res.append(s.charAt(j + steps - 2 * i));
                }
            }
        }

        return res.toString();
    }
}