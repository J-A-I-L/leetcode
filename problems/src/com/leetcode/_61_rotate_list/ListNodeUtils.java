package com.leetcode._61_rotate_list;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ListNodeUtils {


    public static Iterable<Integer> listNodeToIntegerIterable(ListNode head) {
        Collection<Integer> values = new LinkedList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            values.add(currentNode.val);
            currentNode = currentNode.next;
        }
        return values;
    }

    public static String listNodeToString(ListNode head) {
        return StreamSupport.stream(listNodeToIntegerIterable(head).spliterator(), false)
                .map(integer -> Integer.toString(integer))
                .collect(Collectors.joining(", ", "[", "]"));
    }

    public static ListNode buildListNode(int[] elements) {
        if (elements == null || elements.length == 0) {
            return null;
        }

        ListNode head = new ListNode();

        ListNode currentNode = head;
        for (int i = 0; i < elements.length; i++) {
            currentNode.val = elements[i];
            if (i < elements.length - 1) {
                currentNode.next = new ListNode();
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}
