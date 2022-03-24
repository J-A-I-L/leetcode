package com.leetcode._88_merge_sorted_array;

import java.util.Arrays;

class Solution_1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0, index2 = 0, i = 0;

        int[] nums1cpy = Arrays.copyOf(nums1, m);
        while (index1 < m || index2 < n) {
            if (index1 == m) {
                nums1[i] = nums2[index2];
                index2++;
            } else if (index2 == n) {
                nums1[i] = nums1cpy[index1];
                index1++;
            } else if (nums1cpy[index1] < nums2[index2]) {
                nums1[i] = nums1cpy[index1];
                index1++;
            } else {
                nums1[i] = nums2[index2];
                index2++;
            }
            i++;
        }
    }
}
