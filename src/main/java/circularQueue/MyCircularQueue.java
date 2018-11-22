package circularQueue;

class MyCircularQueue {
    private int[] obj;
    private int f, r, l;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        obj = new int[k];
        f = r = -1;
        l = k - 1;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (f == -1 && r == -1);
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return ((r < f && r + 1 == f) || (f < r && r - f == l) || (r == 0 && l == 0));
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (!isFull()) {
            if (isEmpty())
                f++;

            if (r == l) {
                r = 0;
                obj[r] = value;
            } else
                obj[++r] = value;

            return true;
        }

        return false;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (!isEmpty()) {
            if (f == r){
                f = r = -1;
            } else if (f > r && f == l) {
                f = 0;
            } else
                f++;

            return true;
        }

        return false;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (!isEmpty())
            return obj[f];
        return f;
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (!isEmpty())
            return obj[r];
        return r;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
