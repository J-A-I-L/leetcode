package com.leetcode._69_sqrtx;

class Solution {
    public int mySqrt(int x) {
        int min = 0;
        int max = x;
        while (max >= min) {
            int pivot = (min + max) / 2;
            long square = (long) pivot * pivot;
            if (square > x) {
                max = pivot-1;
            } else if (square < x) {
                min = pivot+1;
            } else {
                return pivot;
            }
        }
        return max;
    }
}