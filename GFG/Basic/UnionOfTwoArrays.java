package GFG.Basic;
// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1?page=1&status[]=solved&sortBy=submissions

import java.util.*;

class Solution {
    public static int doUnion(int a[], int n, int b[], int m) {
        HashSet<Integer> s = new HashSet<>();
        for (Integer x : a) {
            s.add(x);
        }
        for (Integer x : b) {
            s.add(x);
        }
        return s.size();
    }
}