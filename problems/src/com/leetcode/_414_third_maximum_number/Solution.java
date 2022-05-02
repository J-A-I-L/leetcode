package com.leetcode._414_third_maximum_number;

class Solution {
    public int thirdMax(int[] nums) {
        int firstMax = nums[0];
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        boolean isSecondSet = false;
        boolean isThirdSet = false;

        for (int num : nums) {
            if (num > firstMax) {
                if (isSecondSet) {
                    thirdMax = secondMax;
                    isThirdSet = isSecondSet;
                }
                secondMax = firstMax;
                isSecondSet = true;
                firstMax = num;
            } else if (num == firstMax) {
            } else if (/*isSecondSet && */num > secondMax
                                          || (!isSecondSet && num == secondMax)) {
                thirdMax = secondMax;
                isThirdSet = isSecondSet;
                secondMax = num;
                isSecondSet = true;
            } else if (num == secondMax) {
            } else if (/*isThirdSet && */num >= thirdMax) {
                thirdMax = num;
                isThirdSet = true;
            }
        }

        if (isThirdSet) {
            return thirdMax;
        } else {
            return firstMax;
        }
    }
}