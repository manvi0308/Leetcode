public class IntegerToRoman {
    public String intToRoman(int nums) {
        StringBuilder sb = new StringBuilder();
        String[] thousands = { "", "M", "MM", "MMM" };
        String[] hundreds = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
        String[] tens = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] ones = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

        sb.append(thousands[nums / 1000]);
        sb.append(hundreds[(nums % 1000) / 100]);
        sb.append(tens[(nums % 100) / 10]);
        sb.append(ones[nums % 10]);
        return sb.toString();
    }
}