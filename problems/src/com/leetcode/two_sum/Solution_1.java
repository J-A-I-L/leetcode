package com.leetcode.two_sum;

class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        //int[] result = {0, 0}
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0, 0};
    }
}