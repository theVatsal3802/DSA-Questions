package GFG.Medium;
// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1?page=1&status[]=solved&sortBy=submissions

import java.util.*;

class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
