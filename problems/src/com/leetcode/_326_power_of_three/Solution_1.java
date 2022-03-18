package com.leetcode._326_power_of_three;

class Solution_1 {
    public boolean isPowerOfThree(int n) {
        int i = 3;
        while (i<n) {
            i *= 3;
        }
        return i == n;
    }
}
