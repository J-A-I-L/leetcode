package com.leetcode._101_symmetric_tree._xx_sample_test;

import java.util.Objects;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return treeNodeSymmetricHashCode(root.left, true) == treeNodeSymmetricHashCode(root.right, false);
    }

    public int treeNodeSymmetricHashCode(TreeNode treeNode, boolean isLeftNode) {
        if (treeNode == null) {
            return 0;
        }
        if (isLeftNode) {
            return Objects.hash(treeNode.val, treeNodeSymmetricHashCode(treeNode.left, isLeftNode), treeNodeSymmetricHashCode(treeNode.right, isLeftNode));
        } else {
            return Objects.hash(treeNode.val, treeNodeSymmetricHashCode(treeNode.right, isLeftNode), treeNodeSymmetricHashCode(treeNode.left, isLeftNode));
        }
    }
}