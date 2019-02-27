package isPowerOfTwo;

public class SolutionIII {
    public boolean isPowerOfTwo(int n) {
        int high = 30;
        int low = 0;

        while (high - low > 1) {
            int mid = (high + low) / 2;
            int val = (int) Math.pow(2, mid);

            if (val > n) high = mid;
            else if (val < n) low = mid;
            else return true;
        }

        return Math.pow(2, high) == n || Math.pow(2, low) == n;
    }
}
