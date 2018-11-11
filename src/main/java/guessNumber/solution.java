package guessNumber;

public class solution {
    /* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

    public int guessNumber(int n) {
        long l = 0, h = n, mid;
        int res;

        do {
            mid = (l + h) / 2;
            res = mid < 0 ? -1 : guess((int) mid);
            if (res == -1) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        } while (res != 0);
        return ((int) mid);
    }

    private int guess(int num){
        return 0;
    }
}
