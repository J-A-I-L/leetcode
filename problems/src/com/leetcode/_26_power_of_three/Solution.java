package com.leetcode._26_power_of_three;

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        int x = 1162261467; // 3^19 is the largest power of 3 < Integer.MAX_VALUE
        // It is 3*3*...*3. So, it's divisible by 3 iif it's remainder is 0.
        return x%n == 0;
    }
}
