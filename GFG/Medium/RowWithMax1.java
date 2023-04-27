package GFG.Medium;
// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1?page=1&status[]=solved&sortBy=submissions

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int row = 0;
        int max1 = m;
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (max1 != 0) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] == 0) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
            if (count < max1) {
                max1 = count;
                row = i;
            }
        }
        if (max1 == m) {
            return -1;
        }
        return row;
    }
}