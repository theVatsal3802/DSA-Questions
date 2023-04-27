package GFG.School;
// https://practice.geeksforgeeks.org/problems/find-the-median0527/1?page=1&status[]=solved&sortBy=submissions

import java.util.*;

class Solution {
    public int find_median(int[] v) {
        Arrays.sort(v);
        if (v.length % 2 != 0) {
            return v[v.length / 2];
        }
        int sum = 0;
        sum += v[v.length / 2] + v[(v.length / 2) - 1];
        sum /= 2;
        return sum;
    }
}