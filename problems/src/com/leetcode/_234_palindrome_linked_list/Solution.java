package com.leetcode._234_palindrome_linked_list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode node;

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        if (node == null) {
            node = head;
        }

        boolean isPalindrome = isPalindrome(head.next);
        if (head.val == node.val) {
            node = node.next;
        } else {
            return false;
        }
        return isPalindrome;
    }
}
