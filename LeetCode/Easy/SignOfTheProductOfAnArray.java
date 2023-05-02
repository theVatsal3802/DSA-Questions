package LeetCode.Easy;
// https://leetcode.com/problems/sign-of-the-product-of-an-array/

class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return 1;
        }
        return -1;
    }
}