package validAnagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] anagramChar = new int[128];

        for (int i = 0; i < s.length(); i++) {
            anagramChar[s.charAt(i)]++;
            anagramChar[t.charAt(i)]--;
        }

        for (int c : anagramChar) {
            if (c != 0) return false;
        }

        return true;
    }
}
