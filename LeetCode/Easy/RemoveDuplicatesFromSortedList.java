package LeetCode.Easy;
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        ListNode temp = null;
        HashSet<Integer> s = new HashSet<>();
        while (node != null) {
            int val = node.val;
            if (s.contains(val)) {
                temp.next = node.next;
            } else {
                s.add(val);
                temp = node;
            }
            node = node.next;
        }
        return head;
    }
}