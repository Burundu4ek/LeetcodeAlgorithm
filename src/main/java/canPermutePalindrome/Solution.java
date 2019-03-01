package canPermutePalindrome;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean canPermutePalindrome(String s) {
        if (s == null) return false;
        Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charSet.add(s.charAt(i)))
                charSet.remove(s.charAt(i));
        }

        return charSet.size() < 2;
    }
}
