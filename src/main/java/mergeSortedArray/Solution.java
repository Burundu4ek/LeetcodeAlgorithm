package mergeSortedArray;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--; n--;
        for (int i = nums1.length - 1; i >= 0; i--) {
            nums1[i] = m < 0
                    ? nums2[n--] : n < 0
                    ? nums1[m--] : nums1[m] >= nums2[n]
                    ? nums1[m--] : nums2[n--];
        }
    }
}