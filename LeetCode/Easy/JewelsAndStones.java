package LeetCode.Easy;
// https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] j = jewels.toCharArray();
        char[] s = stones.toCharArray();
        int count = 0;
        for (int i = 0; i < j.length; i++) {
            for (int k = 0; k < s.length; k++) {
                if (s[k] == j[i]) {
                    count++;
                }
            }
        }
        return count;
    }
}