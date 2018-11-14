package strStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty())
            return 0;

        char[] h = haystack.toCharArray();
        char n = needle.charAt(0);
        int res = -1, hl = haystack.length(), nl = needle.length();

        for (int i = 0; i <= hl - nl; i++) {
            if (h[i] == n && needle.equals(haystack.substring(i, i + nl))) {
                return i;
            }
        }

        return res;
    }
}
