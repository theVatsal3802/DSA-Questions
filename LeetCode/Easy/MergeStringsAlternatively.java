package LeetCode.Easy;
// https://leetcode.com/problems/merge-strings-alternately/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();
        String result = "";
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                result += String.valueOf(a[i]) + String.valueOf(b[i]);
            }
        } else if (a.length > b.length) {
            for (int i = 0; i < b.length; i++) {
                result += String.valueOf(a[i]) + String.valueOf(b[i]);
            }
            for (int i = b.length; i < a.length; i++) {
                result += String.valueOf(a[i]);
            }
        } else if (a.length < b.length) {
            for (int i = 0; i < a.length; i++) {
                result += String.valueOf(a[i]) + String.valueOf(b[i]);
            }
            for (int i = a.length; i < b.length; i++) {
                result += String.valueOf(b[i]);
            }
        }
        return result;
    }
}