package maxTurbulenceSize;

public class Solution {
    public int maxTurbulenceSize(int[] A) {
        int max = 1;
        int localMax = 1;
        boolean bigger = A.length == 1 ? false : A[0] < A[1];

        for (int i = 1; i < A.length; i++) {
            if (bigger == A[i - 1] < A[i] && A[i - 1] != A[i]) {
                localMax++;
                bigger = !bigger;
            } else {
                max = Math.max(max, localMax);
                localMax = A[i - 1] == A[i] ? 1 : 2;
                bigger = A[i] < A[i - 1];
            }
        }

        max = Math.max(max, localMax);

        return max;
    }
}