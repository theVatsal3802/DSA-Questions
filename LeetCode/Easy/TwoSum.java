package LeetCode.Easy;
// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int r = target - nums[i];
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[j] == r) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}
