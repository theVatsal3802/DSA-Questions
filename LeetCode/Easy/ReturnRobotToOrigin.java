package LeetCode.Easy;
// https://leetcode.com/problems/robot-return-to-origin/

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    y++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'D':
                    y--;
                    break;
            }
        }
        if (x == 0 && y == 0) {
            return true;
        }
        return false;
    }
}