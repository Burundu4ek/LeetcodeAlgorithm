package isMonotonic;

public class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length < 3)
            return true;

        boolean isBigger = A[0] <= A[A.length - 1];
        int prev = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] != prev) {
                if (A[i] < prev == isBigger)
                    return false;
                prev = A[i];
            }
        }

        return true;
    }
}
