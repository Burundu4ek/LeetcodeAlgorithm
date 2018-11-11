package sqrt;

public class Solution {
    public int mySqrt(int x) {
        long low = 0, high = x, res = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long mulMid = mid * mid;

            if (mulMid == x)
                return ((int) mid);
            else if (mulMid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                res = mid;
            }
        }

        return ((int) res);
    }
}
