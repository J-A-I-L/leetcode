package com.leetcode._66_plus_one;

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {

        boolean carriedOver = false;
        for (int n = digits.length-1; n >= 0; n--) {
            carriedOver = increaseNthDigit(digits, n);
            if (! carriedOver) {
                return digits;
            }
        }

        boolean hasOverflown = carriedOver;
        int[] result = digits;
        if (hasOverflown) {
            result = Arrays.copyOf(digits, digits.length + 1);
            result[0] = 1;
        }
        return result;
    }

    private boolean increaseNthDigit(int[] digits, int n) {
        if (++digits[n] > 9) {
            digits[n] = 0;
            return true;
        }
        return false;
    }
}
