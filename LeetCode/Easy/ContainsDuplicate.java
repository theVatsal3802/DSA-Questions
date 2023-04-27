package LeetCode.Easy;
// https://leetcode.com/problems/contains-duplicate/

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for (Integer x : nums) {
            s.add(x);
        }
        if (s.size() == nums.length) {
            return false;
        }
        return true;
    }
}