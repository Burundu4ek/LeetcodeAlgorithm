package squaresOfSortedArray;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {
        boolean sorted = A[0] > -1;

        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
        }

        if (!sorted) Arrays.sort(A);

        return A;
    }
}
