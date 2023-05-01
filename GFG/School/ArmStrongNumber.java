package GFG.School;
// https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1

class Solution {
    static String armstrongNumber(int n) {
        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;
        int sum = (a * a * a) + (b * b * b) + (c * c * c);
        if (sum == n) {
            return "Yes";
        }
        return "No";
    }
}