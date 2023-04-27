package LeetCode.Easy;
// https://leetcode.com/problems/isomorphic-strings/

import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> m = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                if (m.get(s.charAt(i)) == t.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (m.containsValue(t.charAt(i))) {
                    return false;
                } else {
                    m.put(s.charAt(i), t.charAt(i));
                }
            }
        }
        return true;
    }
}
