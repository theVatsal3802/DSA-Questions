package LeetCode.Easy;
// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] counts = new int[sentences.length];
        int k = 0;
        for (String s : sentences) {
            counts[k] = (s.split(" ", 0)).length;
            k++;
        }
        int max = counts[0];
        for (Integer x : counts) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}