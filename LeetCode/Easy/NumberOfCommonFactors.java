package LeetCode.Easy;
// https://leetcode.com/problems/number-of-common-factors/

class Solution {
    public int commonFactors(int a, int b) {
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}