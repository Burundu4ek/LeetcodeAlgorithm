package firstUniqChar;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int firstUniqChar(String s) {
        Set<Character> allChars = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (!allChars.contains(cur)) {
                if (s.lastIndexOf(cur) == i)
                    return i;
                else
                    allChars.add(cur);
            }
        }

        return -1;
    }
}
