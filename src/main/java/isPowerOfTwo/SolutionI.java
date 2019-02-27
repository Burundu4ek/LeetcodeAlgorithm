package isPowerOfTwo;

public class SolutionI {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        int l = 2;
        int maxInt = Integer.MAX_VALUE / 2 + 1;

        while (l < n && l < maxInt) {
            l *= 2;
        }

        return l == n;
    }
}
