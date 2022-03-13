package com.leetcode.merge_two_sorted_lists;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            // Input: list1 = [], list2 = []
            // Output: []
            return null;
        }

        ListNode result = new ListNode();
        ListNode currNode = result;
        ListNode nextNode = new ListNode();
        while (list1 != null || list2 != null) {

            // Copy Value
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    currNode.val = list1.val;
                    list1 = list1.next;
                } else {
                    currNode.val = list2.val;
                    list2 = list2.next;
                }
                currNode.next = new ListNode();
                currNode = currNode.next;

            } else if (list1 != null) {
                currNode.val = list1.val;
                list1 = list1.next;
                if (list1 != null) {
                    currNode.next = new ListNode();
                    currNode = currNode.next;
                }
            } else /*if (list2 != null)*/ {
                currNode.val = list2.val;
                list2 = list2.next;
                if (list2 != null) {
                    currNode.next = new ListNode();
                    currNode = currNode.next;
                }
            }
        }
        return result;
    }
}