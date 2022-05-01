package com.leetcode._342_power_of_four;

class Solution {
    public boolean isPowerOfFour(int n) {
//        1 (10  =       1 (2
//        2 (10  =      10 (2
//        4 (10  =     100 (2
//        5 (10  =     101 (2
//        8 (10  =    1000 (2
//        16 (10 =  1 0000 (2
//        32 (10 = 10 0000 (2

//        boolean hasOnlyOne1InBinaryForm = (n & (n - 1)) == 0;
//
//        int mask = 0b01010101010101010101010101010101; // Removes multiples of 2 but not of 4.
//        boolean isMultipleOf4ButNotOf2 = (n & mask) != 0;
//
//        return n > 0 && hasOnlyOne1InBinaryForm && isMultipleOf4ButNotOf2;
        return n > 0 && (n & (n - 1)) == 0 && (n & 0b01010101010101010101010101010101) != 0;
    }
}
