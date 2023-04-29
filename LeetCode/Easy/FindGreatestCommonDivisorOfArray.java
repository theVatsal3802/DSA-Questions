package LeetCode.Easy;
// https://leetcode.com/problems/find-greatest-common-divisor-of-array/

import java.util.*;

class Solution {
    public int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length - 1]);
    }
}
