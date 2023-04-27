package LeetCode.Easy;
// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/

class Solution {
    private int getElementSum(int[] nums) {
        int sum = 0;
        for (Integer i : nums) {
            sum += i;
        }
        return sum;
    }

    private int getDigitSum(int[] nums) {
        int sum = 0;
        for (Integer i : nums) {
            int r;
            while (i > 0) {
                r = i % 10;
                sum += r;
                i /= 10;
            }
        }
        return sum;
    }

    public int differenceOfSum(int[] nums) {
        int elementSum = getElementSum(nums);
        int digitSum = getDigitSum(nums);
        return Math.abs(elementSum - digitSum);
    }
}