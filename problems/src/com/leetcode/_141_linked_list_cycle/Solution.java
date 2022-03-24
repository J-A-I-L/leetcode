package com.leetcode._141_linked_list_cycle;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    Set<ListNode> travelledNodes = new HashSet<>();

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        while (head.next != null) {
            if (travelledNodes.contains(head)) {
                return true;
            }
            travelledNodes.add(head);
            head = head.next;
        }
        return false;
    }
}