package LeetCode.Easy;
// https://leetcode.com/problems/find-the-difference-of-two-arrays/

import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for (Integer x : nums1) {
            s1.add(x);
        }
        for (Integer x : nums2) {
            s2.add(x);
        }
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for (Integer x : s1) {
            if (!s2.contains(x)) {
                a1.add(x);
            }
        }
        for (Integer x : s2) {
            if (!s1.contains(x)) {
                a2.add(x);
            }
        }
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        a.add(a1);
        a.add(a2);
        return a;
    }
}