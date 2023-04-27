package LeetCode.Medium;
// https://leetcode.com/problems/find-the-duplicate-number/

import java.util.*;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 0) {
                return nums[i];
            }
        }
        return -1;
    }
}