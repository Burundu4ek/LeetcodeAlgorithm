package twoSumII;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, h = numbers.length - 1, sum;

        while ((sum = numbers[l] + numbers[h]) != target && h != l) {
            if (sum > target)
                h = binarySearch(numbers, l + 1, h - 1, target - numbers[l]);
            else if (sum < target)
                l = binarySearch(numbers, l + 1, h - 1 , target - numbers[h]);
        }

        return new int[]{l + 1, h + 1};
    }

    private static int binarySearch(int[] numbers, int low, int high, int target) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (target == numbers[mid]) {
                return mid;
            } else if (target < numbers[mid]) {
                high = mid;
            } else
                low = mid + 1;
        }

        return high;
    }
}
