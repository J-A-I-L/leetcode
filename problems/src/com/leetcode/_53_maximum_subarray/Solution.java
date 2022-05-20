package com.leetcode._53_maximum_subarray;

class Solution {
    public int maxSubArray(int[] nums) {
        int absoluteMax = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max + nums[i], nums[i]);
            absoluteMax = Math.max(absoluteMax, max);
        }
        return absoluteMax;
    }
}