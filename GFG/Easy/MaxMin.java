package GFG.Easy;
// https://practice.geeksforgeeks.org/problems/max-min/1?page=1&status[]=solved&sortBy=submissions

import java.util.*;

class Solution {
    public static int findSum(int A[], int N) {
        Arrays.sort(A);
        return A[0] + A[N - 1];
    }
}
