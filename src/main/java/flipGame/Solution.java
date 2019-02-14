package flipGame;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.length() < 2) return res;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == '+' && s.charAt(i) == '+') {
                char[] state = s.toCharArray();
                state[i - 1] = '-';
                state[i] = '-';
                res.add(new String(state));
            }
        }

        return res;
    }
}
