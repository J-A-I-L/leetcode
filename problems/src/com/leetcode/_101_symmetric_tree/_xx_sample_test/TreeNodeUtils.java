package com.leetcode._101_symmetric_tree._xx_sample_test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TreeNodeUtils {
    public static Iterable<Integer> treeNodeToIntegerIterable(TreeNode root) {
        Collection<Integer> values = new LinkedList<>();
        TreeNode currentNode = root;
        while (currentNode != null) {
            values.add(currentNode.val);
            currentNode = currentNode.next;
        }
        return values;
    }

    public static String treeNodeToString(TreeNode head) {
        return StreamSupport.stream(treeNodeToIntegerIterable(head).spliterator(), false)
                .map(integer -> Integer.toString(integer))
                .collect(Collectors.joining(", ", "[", "]"));
    }

    public static TreeNode buildTreeNode(int[] elements) {
        if (elements == null || elements.length == 0) {
            return null;
        }

        TreeNode head = new TreeNode();

        TreeNode currentNode = head;
        for (int i = 0; i < elements.length; i++) {
            currentNode.val = elements[i];
            if (i < elements.length - 1) {
                currentNode.next = new TreeNode();
                currentNode = currentNode.next;
            }
        }

        return head;
    }

}

