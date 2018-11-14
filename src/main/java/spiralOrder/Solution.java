package spiralOrder;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        long resLength = matrix[0].length * matrix.length;
        // t - top side, r - ght side, b - bottom side, l - left side
        int t = 0, r = 0, b = 0, l = 0, i, j;

        while (res.size() < resLength) {
            //go right
            for (i = t, j = l; j < matrix[0].length - r && res.size() < resLength; j++) {
                res.add(matrix[i][j]);
            }
            t++;

            //go down
            for (i = t, j -= 1; i < (matrix.length - b) && res.size() < resLength; ) {
                res.add(matrix[i++][j]);
            }
            r++;

            //go left
            for (j -= 1, i -= 1; j >= l && res.size() < resLength; j--) {
                res.add(matrix[i][j]);
            }
            b++;

            //go up
            for (i -= 1, j += 1; i >= t && res.size() < resLength; i--) {
                res.add(matrix[i][j]);
            }
            l++;
        }

        return res;
    }
}
