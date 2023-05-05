package Leetcode.Easy;
// https://leetcode.com/problems/capitalize-the-title/

class Solution {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String[] s = title.split(" ");
        String ans = "";
        for (String x : s) {
            if (x.length() > 2) {
                x = x.substring(0, 1).toUpperCase() + x.substring(1);
            }
            ans = ans.concat(x + " ");
        }
        return ans.trim();
    }
}