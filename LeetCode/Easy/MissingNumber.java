package LeetCode.Easy;
// https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = ((n) * (n + 1)) / 2;
        int sum1 = 0;
        for (Integer x : nums) {
            sum1 += x;
        }
        return (sum - sum1);
    }
}
