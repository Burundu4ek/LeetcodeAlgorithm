package lengthOfLongestSubstring;

public class BetterSolution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0, prevIndex = 0;
        int[] charIdx = new int[128];

        for (int i = 0; i < s.length(); ) {
            char curChar = s.charAt(i);

            prevIndex = Math.max(charIdx[curChar], prevIndex);
            longest = Math.max(longest, i - prevIndex + 1);
            charIdx[curChar] = ++i;
        }

        return longest;
    }
}
