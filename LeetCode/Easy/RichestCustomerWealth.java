package LeetCode.Easy;
// https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
        int k = 0;
        for (int[] x : accounts) {
            int sum = 0;
            for (Integer y : x) {
                sum += y;
            }
            wealth[k] = sum;
            k++;
        }
        int max = wealth[0];
        for (Integer x : wealth) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}