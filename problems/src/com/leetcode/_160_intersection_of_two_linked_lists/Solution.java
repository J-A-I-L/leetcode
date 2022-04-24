package com.leetcode._160_intersection_of_two_linked_lists;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> listAVisitedNodes = new HashSet<>();

        while (headA != null) {
            listAVisitedNodes.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (listAVisitedNodes.contains(headB)) {
                break;
            }
            headB = headB.next;
        }

        return headB;
    }
}
