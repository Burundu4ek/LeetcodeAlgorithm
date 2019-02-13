package lengthOfLongestSubstring;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;
        int res = 1;
        String str = "" + s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i)) >= 0) {
                if (res < str.length()) res = str.length();

                str = s.charAt(i) == s.charAt(i - 1) ? ""
                        : str.substring(str.indexOf(s.charAt(i)) + 1);
            }
            str += s.charAt(i);
        }

        return res < str.length() ? str.length() : res;
    }
}
