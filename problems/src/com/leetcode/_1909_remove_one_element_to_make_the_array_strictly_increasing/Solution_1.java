package com.leetcode._1909_remove_one_element_to_make_the_array_strictly_increasing;

class Solution_1 {
    public boolean canBeIncreasing(int[] nums) {
        boolean isIncreasingBeforeMaximum = false;
        boolean isIncreasingAfterMaximum = false;

        int i = 0;
        boolean isOnlyOneMaximumFound = false;
        while (!isOnlyOneMaximumFound && i < nums.length-1) { // 2 <= nums.length
            isIncreasingBeforeMaximum = nums[i] < nums[i + 1];
            isOnlyOneMaximumFound = !isIncreasingBeforeMaximum;
            i++;
        }

        while (isOnlyOneMaximumFound && i < nums.length-1) { // 2 <= nums.length
            isIncreasingAfterMaximum = nums[i] < nums[i + 1];
            isOnlyOneMaximumFound = isIncreasingAfterMaximum;
            i++;
        }

        return isIncreasingBeforeMaximum || isIncreasingAfterMaximum;
    }
}
