package LeetCode.Easy;
// https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum[i] = findSum(i, nums);
        }
        return sum;
    }

    int findSum(int index, int[] nums) {
        int sum = 0;
        for (int i = 0; i <= index; i++) {
            sum += nums[i];
        }
        return sum;
    }
}