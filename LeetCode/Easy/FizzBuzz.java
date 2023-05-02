package LeetCode.Easy;
// https://leetcode.com/problems/fizz-buzz/

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> s = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                s.add("FizzBuzz");
            } else if (i % 3 == 0) {
                s.add("Fizz");
            } else if (i % 5 == 0) {
                s.add("Buzz");
            } else {
                s.add(Integer.toString(i));
            }
        }
        return s;
    }
}
