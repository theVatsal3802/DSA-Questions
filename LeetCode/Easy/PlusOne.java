package LeetCode.Easy;
// https://leetcode.com/problems/plus-one/

import java.util.*;

class Solution {
    public int[] plusOne(int[] digits) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        boolean carry = true;
        for (int i = 0; i < digits.length; i++) {
            num.add(digits[i]);
        }
        for (int i = num.size() - 1; i >= 0; i--) {
            if (num.get(i) != 9) {
                num.set(i, num.get(i) + 1);
                carry = false;
                break;
            } else {
                num.set(i, 0);
                carry = true;
            }
        }
        if (num.getFirst() == 0 && carry) {
            num.addFirst(1);
            carry = false;
        }
        int[] number = new int[num.size()];
        for (int i = 0; i < num.size(); i++) {
            number[i] = num.get(i);
        }
        return number;
    }
}