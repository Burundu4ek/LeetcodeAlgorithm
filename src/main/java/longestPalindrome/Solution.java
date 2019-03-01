package longestPalindrome;

public class Solution {
    public int longestPalindrome(String s) {
        int[] charS = new int[128];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            charS[s.charAt(i)]++;
        }

        for (int c : charS) {
            if (count % 2 != 0)
                count += (c / 2) * 2;
            else count += c;
        }

        return count;
    }
}
