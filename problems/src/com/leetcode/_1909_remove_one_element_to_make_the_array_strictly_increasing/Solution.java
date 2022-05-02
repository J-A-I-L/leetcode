package com.leetcode._1909_remove_one_element_to_make_the_array_strictly_increasing;

class Solution {
    public boolean canBeIncreasing(int[] nums) {
        if (isIncreasing(nums)) {
            return true;
        }

        for (int i = 0; i < nums.length; i++) {
            int[] numsRemovingElm = arrayRemovingElementAtPos(nums, i);
            if (isIncreasing(numsRemovingElm)) {
                return true;
            }
        }
        return false;
    }

    private boolean isIncreasing(int[] nums) {
        boolean isIncreasing = nums.length <= 1;
        for (int i = 0; i < nums.length - 1; i++) {
            isIncreasing = nums[i] < nums[i + 1];
            if (!isIncreasing) {
                break;
            }
        }
        return isIncreasing;
    }

    public int[] arrayRemovingElementAtPos(int[] srcArray, int positionToRemove) {
        int[] result = new int[srcArray.length-1];
        System.arraycopy(srcArray, 0, result, 0,positionToRemove);
        System.arraycopy(srcArray, positionToRemove+1, result, positionToRemove,srcArray.length-positionToRemove-1);
        return result;
    }
}
