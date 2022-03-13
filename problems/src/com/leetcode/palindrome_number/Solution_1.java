package com.leetcode.palindrome_number;

//import java.nio.charset.StandardCharsets;

class Solution_1 {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
//        char[] array = s.toCharArray();
        byte[] array = s.getBytes();

        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - i - 1]) {
                return false;
            }
        }

        return true;
    }
}
