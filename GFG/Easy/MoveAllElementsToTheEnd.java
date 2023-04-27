package GFG.Easy;
// https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1?page=1&status[]=solved&sortBy=submissions

import java.util.*;

class Solution {
    public void segregateElements(int arr[], int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (Integer x : arr) {
            if (x >= 0) {
                pos.add(x);
            } else {
                neg.add(x);
            }
        }
        Iterator<Integer> iterator = pos.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            arr[i] = iterator.next();
            i++;
        }
        Iterator<Integer> iterator1 = neg.iterator();
        while (iterator1.hasNext()) {
            arr[i] = iterator1.next();
            i++;
        }
    }
}