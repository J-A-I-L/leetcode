package com.leetcode._125_valid_palindrome;

class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
        int front = 0, end = length - 1;
        while (front < end) {
            while (front < end && !Character.isLetterOrDigit(s.charAt(front))) {
                front++;
            }
            while (front < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            front++;
            end--;
        }
        return true; // front != end if we are accepting "a1b1a" as a palindrome.
    }
}
