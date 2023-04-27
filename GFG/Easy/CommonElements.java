package GFG.Easy;
// https://practice.geeksforgeeks.org/problems/common-elements1132/1?page=1&status[]=solved&sortBy=submissions

import java.util.*;

class Solution {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();
        for (Integer x : A) {
            a.add(x);
        }
        for (Integer x : B) {
            b.add(x);
        }
        for (Integer x : C) {
            c.add(x);
        }
        a.retainAll(b);
        a.retainAll(c);
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer x : a) {
            ans.add(x);
        }
        Collections.sort(ans);
        return ans;
    }
}