package LeetCode.Easy;
// https://leetcode.com/problems/shuffle-string/

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c[indices[i]] = s.charAt(i);
        }
        String ans = "";
        for (Character x : c) {
            ans += x;
        }
        return ans;
    }
}