package isIsomorphic;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                if (!charMap.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            } else if (charMap.containsValue(t.charAt(i))) {
                return false;
            } else
                charMap.put(s.charAt(i), t.charAt(i));
        }

        return true;
    }
}
