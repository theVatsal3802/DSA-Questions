package LeetCode.Easy;
// https://leetcode.com/problems/valid-parentheses/

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for (Character ch : c) {
            if (ch == '(') {
                st.push(ch);
            } else if (ch == '{') {
                st.push(ch);
            } else if (ch == '[') {
                st.push(ch);
            } else if (ch == ']') {
                if (!st.empty() && st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (ch == '}') {
                if (!st.empty() && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (ch == ')') {
                if (!st.empty() && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.empty()) {
            return true;
        }
        return false;
    }
}