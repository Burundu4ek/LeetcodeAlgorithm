package rotateArray;

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k < 1) return;
        k = k % nums.length;

        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    public void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

//    public static void main(String[] args){
//        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
//    }

}
