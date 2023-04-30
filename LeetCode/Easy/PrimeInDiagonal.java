package LeetCode.Easy;
// https://leetcode.com/problems/prime-in-diagonal/

class Solution {
    public boolean isPrime(int n) {
        for (int i = 2; i <= (int) (Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int diagonalPrime(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            boolean ans = isPrime(nums[i][i]);
            if (ans && nums[i][i] > max) {
                max = nums[i][i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            boolean ans = isPrime(nums[i][nums[0].length - 1 - i]);
            if (ans && nums[i][nums[0].length - 1 - i] > max) {
                max = nums[i][nums[0].length - 1 - i];
            }
        }
        if (max == Integer.MIN_VALUE || max == 1) {
            return 0;
        }
        return max;
    }
}