package excelSheetColumnNumber;

public class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        if (s == null) return res;

        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            res += (s.charAt(i) - 64) * Math.pow(26, j);
        }

        return res;
    }
}
