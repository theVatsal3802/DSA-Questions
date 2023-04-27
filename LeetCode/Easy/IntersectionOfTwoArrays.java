package LeetCode.Easy;
// https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (Integer x : nums1) {
            s1.add(x);
        }
        for (Integer x : nums2) {
            s2.add(x);
        }
        s1.retainAll(s2);
        int[] result = new int[s1.size()];
        int i = 0;
        for (Integer x : s1) {
            result[i] = x;
            i++;
        }
        return result;
    }
}