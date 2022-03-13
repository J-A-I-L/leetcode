package com.leetcode._26_remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
        int writeIndex = -1;
        int lastWrittenValue = Integer.MIN_VALUE;
        for (int readIndex = 0; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] != lastWrittenValue) {
                lastWrittenValue = nums[readIndex];
                writeIndex++;
                nums[writeIndex] = lastWrittenValue;
            }
        }
        return writeIndex+1;
    }
}
