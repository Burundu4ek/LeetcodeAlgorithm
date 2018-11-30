package pascalTriangleII;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        for (int i = 0; i < rowIndex; i++) {

            List<Integer> tempArr = new ArrayList<>(res.size() + 1);
            for (int j = 0; j < res.size() + 1; j++) {
                if (j == 0 || j == res.size())
                    tempArr.add(j, 1);
                else {
                    tempArr.add(j, res.get(j - 1) + res.get(j));
                }
            }
            res = tempArr;
        }

        return res;
    }

//    public static void main(String[] args) {
//        getRow(3);
//    }
}
