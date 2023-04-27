package LeetCode.Medium;
// https://leetcode.com/problems/removing-stars-from-a-string/

import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                ch.push(s.charAt(i));
            } else {
                ch.pop();
            }
        }
        String string = "";
        while (!ch.empty()) {
            string = string + ch.pop().toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        return sb.toString();
    }
}