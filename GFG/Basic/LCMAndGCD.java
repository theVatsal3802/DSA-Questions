package GFG.Basic;
// https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1

class Solution {
    static Long GCD(Long A, Long B) {
        if (B == 0) {
            return A;
        }
        return GCD(B, A % B);
    }

    static Long[] lcmAndGcd(Long A, Long B) {
        Long[] ans = new Long[2];
        if (A > B) {
            ans[1] = GCD(A, B);
        } else {
            ans[1] = GCD(B, A);
        }
        ans[0] = (A * B) / ans[1];
        return ans;
    }
};