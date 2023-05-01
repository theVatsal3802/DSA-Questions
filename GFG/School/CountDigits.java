package GFG.School;
// https://practice.geeksforgeeks.org/problems/count-digits5716/1

class Solution {
    static int evenlyDivides(int N) {
        int count = 0;
        int x = N;
        while (N > 0) {
            int r = N % 10;
            if (r != 0 && x % r == 0) {
                count++;
            }
            N /= 10;
        }
        return count;
    }
}