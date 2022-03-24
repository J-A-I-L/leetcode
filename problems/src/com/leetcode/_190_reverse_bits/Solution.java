package com.leetcode._190_reverse_bits;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        for (int i = 0; i < 16; i++) {
            // Read
            int iThBitBack = n & (1 << i);
            int iThBitFront = n & (1 << (31 - i));

            // Write
            n = setIthBit(n, i, iThBitFront);
            n = setIthBit(n, 31 - i, iThBitBack);
        }

        return n;
    }

    private int setIthBit(int n, int i, int newValue) {
        if (newValue == 0) {
            n = (n & ~(1 << i));
        } else {
            n = (n | (1 << i));
        }
        return n;
    }
}