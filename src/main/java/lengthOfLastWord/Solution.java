package lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null)
            return 0;

        boolean isWord = false;
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && isWord) {
                return count;
            } else if (s.charAt(i) != ' ') {
                count++;
                isWord = true;
            }
        }

        return count;
    }
}
