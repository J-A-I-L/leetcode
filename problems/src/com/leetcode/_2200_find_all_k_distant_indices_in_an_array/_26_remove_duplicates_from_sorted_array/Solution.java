package com.leetcode._2200_find_all_k_distant_indices_in_an_array._26_remove_duplicates_from_sorted_array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        // 1.- Find the indices for key.
        Set<Integer> zeroDistanceIndices = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                zeroDistanceIndices.add(i);
            }
        }
        System.out.println(zeroDistanceIndices.toString());

        // 2.- Add indices without repeating them and inside the array limits.
        Set<Integer> kDistanceIndices = new HashSet<>();
        for (Integer index : zeroDistanceIndices) {
            for (int i = index - k; i < index + k + 1; i++) {
                if (i >= 0 && i < nums.length) {
                    kDistanceIndices.add(i);
                }
            }
        }
        return kDistanceIndices.stream().sorted().collect(Collectors.toList());
    }
}
