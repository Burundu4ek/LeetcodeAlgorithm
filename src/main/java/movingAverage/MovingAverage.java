package movingAverage;

import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {
    Queue<Integer> q;
    int size;
    int sum = 0;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        q = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        sum += val;

        if (q.size() > size - 1) {
            sum -= q.poll();
        }
        q.add(val);

        return (double) sum / q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */

