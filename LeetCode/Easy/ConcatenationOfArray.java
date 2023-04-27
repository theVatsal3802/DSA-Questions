package LeetCode.Easy;
// https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num = new int[2 * nums.length];
        int n = nums.length;
        for (int i = 0; i < 2 * nums.length; i++) {
            if (i < n) {
                num[i] = nums[i];
            } else {
                num[i] = nums[i - n];
            }
        }
        return num;
    }
}