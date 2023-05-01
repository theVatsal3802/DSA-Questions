package LeetCode.Easy;
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

import java.util.*;

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0.0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        double avg = sum / (salary.length - 2);
        return avg;
    }
}
