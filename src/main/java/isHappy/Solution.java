package isHappy;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> setNum = new HashSet<>();

        while (n > 1) {
            if (setNum.contains(n)) return false;
            setNum.add(n);
            int cur = 0;

            while (n > 0) {
                cur += Math.pow(n % 10, 2);
                n /= 10;
            }

            n = cur;
        }

        return n == 1;
    }
}
