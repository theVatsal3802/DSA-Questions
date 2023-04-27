package LeetCode.Medium;
// https://leetcode.com/problems/reverse-integer/

class Solution {
    public int reverse(int x) {
        int a = x;
        int num = Math.abs(x);
        long sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum = (sum * 10) + r;
            num /= 10;
        }
        if (a < 0) {
            sum = -1 * sum;
        }
        if (sum < Math.pow(-2, 31) || sum > (Math.pow(2, 31) - 1)) {
            return 0;
        }
        int ans = (int) sum;
        return ans;
    }
}