package LeetCode.Easy;
// https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[2 * n];
        int k = 0;
        for (int i = 0, j = n; i < n && j < 2 * n; i++) {
            a[k] = nums[i];
            k++;
            a[k] = nums[j];
            k++;
            j++;
        }
        return a;
    }
}