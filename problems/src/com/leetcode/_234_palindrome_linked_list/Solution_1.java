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
class Solution_1 {
    public boolean isPalindrome(ListNode head) {
        ListNode reversedListHead = reverseList(head, null);

        while (head.next != null && reversedListHead.next != null) {
            if (head.val != reversedListHead.val){
                return false;
            }
            head = head.next;
            reversedListHead = reversedListHead.next;
        }
        return head.val == reversedListHead.val;
    }

    private ListNode reverseList(ListNode straightList, ListNode reverserdList) {
        ListNode currentNode = new ListNode(straightList.val, reverserdList);

        if (straightList.next == null) {
            return currentNode;
        } else {
            return reverseList(straightList.next, currentNode);
        }
    }
}
