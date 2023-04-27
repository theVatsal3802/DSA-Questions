package LeetCode.Easy;
// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String s : operations) {
            if (s.equalsIgnoreCase("X++") || s.equalsIgnoreCase("++x")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}