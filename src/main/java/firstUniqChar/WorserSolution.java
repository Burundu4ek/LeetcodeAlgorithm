package firstUniqChar;

import java.util.HashMap;
import java.util.Map;

public class WorserSolution {

    public int firstUniqChar(String s) {
        Map<Character, Integer> allChars = new HashMap<>();
        int res = s.length();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);

            if (allChars.containsKey(cur)) {
                allChars.put(cur, i + s.length());
            } else {
                allChars.put(cur, i);
            }
        }

        for (int v : allChars.values()) {
            res = v < res ? v : res;
        }

        return res < s.length() ? res : -1;
    }
}
