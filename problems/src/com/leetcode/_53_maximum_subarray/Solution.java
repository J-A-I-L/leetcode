package com.leetcode._53_maximum_subarray;

class Solution {
    public int maxSubArray(int[] nums) {
        int absoluteMax = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length; j > i; j--) {
                int max = 0;
                for (int k = i; k < j; k++) {
                    max += nums[k];
                }
                if (max > absoluteMax) {
                    absoluteMax = max;
                }
            }
        }
        return absoluteMax;
    }
}