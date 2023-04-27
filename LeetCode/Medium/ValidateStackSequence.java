package LeetCode.Medium;
// https://leetcode.com/problems/validate-stack-sequences/

import java.util.*;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int pushedSize = pushed.length;
        int poppedSize = popped.length;
        if (pushedSize != poppedSize) {
            return false;
        }
        Stack<Integer> s = new Stack<>();
        int i = 0, j = 0;
        while (i < pushedSize) {
            s.push(pushed[i]);
            while (!s.empty() && s.peek() == popped[j]) {
                s.pop();
                j++;
            }
            i++;
        }
        if (s.empty()) {
            return true;
        }
        return false;
    }
}
