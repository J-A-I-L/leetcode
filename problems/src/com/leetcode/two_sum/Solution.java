package com.leetcode.two_sum;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] targetMinusX = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            targetMinusX[i] = target - nums[i];
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(targetMinusX));

        for (int i = 0; i < nums.length; i++) {
            targetMinusX[i] = target - nums[i];
            for (int j = 0; j < nums.length; j++) {

                if (i != j &&
                        nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{0, 0};
    }
}