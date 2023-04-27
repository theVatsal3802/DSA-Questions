package LeetCode.Easy;
// https://leetcode.com/problems/reverse-string/

class Solution {
    public char[] reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
        return s;
    }
}