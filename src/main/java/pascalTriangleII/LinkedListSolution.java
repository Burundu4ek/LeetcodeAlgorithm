package pascalTriangleII;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSolution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new LinkedList<>();
        if (rowIndex < 0) return res;
        res.add(1);

        for (int i = 0; i < rowIndex; i++) {
            int prev = 1;
            int newSize = i + 1;
            for (int j = 1; j <= newSize; j++) {
                if (newSize == j)
                    res.add(1);
                else {
                    int cur = res.get(j);
                    res.set(j, cur + prev);
                    prev = cur;
                }
            }
        }

        return res;
    }

//    public static void main(String[] args) {
//        getRow(3);
//    }
}
