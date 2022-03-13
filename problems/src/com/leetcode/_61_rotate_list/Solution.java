package com.leetcode._61_rotate_list;

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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        ListNode originalHeadNode = head;

        ListNode originalTail = reverse(head); // Note: after reversing the new head is the former tail, and vice-versa.
        originalHeadNode.next = originalTail; // Make cyclic the current list.

        ListNode finalHead = advanceKTimes(originalHeadNode, k);

        ListNode finalTail = finalHead.next; // Make it acyclic again
        finalHead.next = null;

        /* finalHead = */ reverse(finalTail);
        return finalHead;
    }

    /**
     * Reverses the list. It mutates the list to reverse the order of its nodes.
     * @param head of the ListNode to be reversed.
     * @return The new head of the list, which was formerly the tail.
     */
    private ListNode reverse(ListNode head) {
        ListNode previousNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    /**
     * Advances k times and returns the node of the new position.
     * Loses any reference to the head.
     * @param head The initial node  of the list to start from.
     * @param k The number of times to advance.
     * @return The node of the list after advancing k nodes.
     */
    private ListNode advanceKTimes(ListNode head, int k) {
        ListNode currentNode = head;
        while (k > 0) {
            currentNode = currentNode.next;
            k--;
        }
        return currentNode;
    }
}
