package palindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int l = 0, h = chars.length - 1;

        while (l < h) {
            if (chars[l++] != chars[h--])
                return false;
        }

        return true;
    }
}
