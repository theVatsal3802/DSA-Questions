package LeetCode.Easy;
// https://leetcode.com/problems/decode-the-message/

import java.util.*;

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> m = new HashMap<>();
        char[] c = key.toCharArray();
        char start = 'a';
        for (Character x : c) {
            if (m.containsKey(x) || x == ' ') {
                continue;
            }
            m.put(x, start);
            start++;
        }
        String msg = "";
        char[] ms = message.toCharArray();
        for (Character x : ms) {
            if (x == ' ') {
                msg += " ";
            } else {
                msg += Character.toString(m.get(x));
            }
        }
        return msg;
    }
}