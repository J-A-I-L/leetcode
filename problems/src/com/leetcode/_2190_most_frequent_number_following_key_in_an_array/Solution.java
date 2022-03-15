package com.leetcode._2190_most_frequent_number_following_key_in_an_array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> frequencyOfTarget = new HashMap<>();

        frequencyOfTarget.put(nums[nums.length-1], 0);
        for (int i = 0; i < nums.length - 1; i++) {
            frequencyOfTarget.putIfAbsent(nums[i+1], 0);
            if (nums[i] == key) {
                int target = nums[i + 1];
                frequencyOfTarget.put(target, frequencyOfTarget.get(target) + 1);
            }
        }

        return Collections.max(frequencyOfTarget.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}
