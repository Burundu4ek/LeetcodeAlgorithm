package maxSubArray;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxHere = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxHere = maxHere + nums[i] < nums[i] ? nums[i] : maxHere + nums[i];

            if (maxGlobal < maxHere)
                maxGlobal = maxHere;
        }

        return maxGlobal;
    }


//    public static void main(String[] args){
//        maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
//    }
}