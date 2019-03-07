package strobogrammaticNumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isStrobogrammatic(String num) {
        if (num == null) return true;

        Map<Character, Character> strobNum = new HashMap<Character, Character>() {{
            put('0', '0');
            put('1', '1');
            put('6', '9');
            put('8', '8');
            put('9', '6');
        }};
        char[] charNum = new char[num.length()];

        for (int i = 0, j = num.length() - 1; i < num.length(); i++, j--) {
            if (strobNum.containsKey(num.charAt(i)))
                charNum[j] = strobNum.get(num.charAt(i));
            else
                return false;
        }

        return num.equals(new String(charNum));
    }
}
