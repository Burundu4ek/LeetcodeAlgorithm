package largeGroupPositions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (S == null || S.length() < 3) {
            return res;
        }

        char[] sArr = S.toCharArray();
        char curChar = sArr[0];
        int starIndex = 0;

        for (int i = 1; i < S.length(); i++) {
            if (curChar != sArr[i]) {
                if (i - 3 >= starIndex) {
                    res.add(new ArrayList<Integer>(Arrays.asList(starIndex, i - 1)));
                }
                starIndex = i;
                curChar = sArr[i];
            } else if (i == S.length() - 1 && i - 2 >= starIndex) {
                res.add(new ArrayList<Integer>(Arrays.asList(starIndex, i)));
            }
        }

        return res;
    }
}
