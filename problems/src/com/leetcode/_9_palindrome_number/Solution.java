package com.leetcode._9_palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }

        int forward = x;
        long reverse = 0;
        while (x>0) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return forward == reverse;
    }
}
