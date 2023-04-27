package LeetCode.Easy;
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (Integer x : candies) {
            if (x > max) {
                max = x;
            }
        }
        ArrayList<Boolean> result = new ArrayList<>();
        for (Integer x : candies) {
            if (max - x <= extraCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
