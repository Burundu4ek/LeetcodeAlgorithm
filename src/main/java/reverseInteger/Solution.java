package reverseInteger;

class Solution {
    public int reverse(int x) {
        boolean minusSign = x < 0;
        int res = Math.abs(x) % 10;
        int num = Math.abs(x) / 10;
        double min = Integer.MIN_VALUE / 10;
        double max = Integer.MAX_VALUE / 10;

        while (num != 0) {
            if (res < min || res > max)
                return 0;
            res = res * 10 + num % 10;
            num /= 10;
        }

        return minusSign ? res * -1 : res;
    }
}