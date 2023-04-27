package LeetCode.Easy;
// https://leetcode.com/problems/left-and-right-sum-differences/

class Solution {
    public int findLeftSum(int[] nums, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int findRightSum(int[] nums, int index) {
        int sum = 0;
        for (int i = index + 1; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(findLeftSum(nums, i) - findRightSum(nums, i));
        }
        return answer;
    }
}