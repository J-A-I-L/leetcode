package com.leetcode._58_length_of_last_word;


class Solution {
    public int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        boolean wasLastCharacterASpace = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                wasLastCharacterASpace = true;
            } else {
                if (wasLastCharacterASpace) {
                    lengthOfLastWord = 0;
                }
                lengthOfLastWord++;
                wasLastCharacterASpace = false;
            }
        }
        return lengthOfLastWord;
    }
}
