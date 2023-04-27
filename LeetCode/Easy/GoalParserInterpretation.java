package LeetCode.Easy;
// https://leetcode.com/problems/goal-parser-interpretation/

class Solution {
    public String interpret(String command) {
        command = command.replace("()", "o");
        command = command.replace("(al)", "al");
        return command;
    }
}