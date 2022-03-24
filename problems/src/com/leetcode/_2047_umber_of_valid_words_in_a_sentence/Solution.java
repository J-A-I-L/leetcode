package com.leetcode._2047_umber_of_valid_words_in_a_sentence;

import java.util.Collection;
import java.util.List;

class Solution {
    public int countValidWords(String sentence) {
        int count = 0;
        for (String word : sentence.split(" ")) {
            if (isValid(word)) {
                count++;
            }
        }
        return count;
    }

    final static Collection<Character> punctuationMarks = List.of('!', ',', '.');

    private boolean isValid(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        int hyphensFound = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isDigit(c)) {
                return false;
            }
            boolean isFirstPosition = i == 0;
            boolean isLastPosition = i == word.length() - 1;
            if (c == '-') {
                if (isFirstPosition || isLastPosition) {
                    return false;
                } else if (hyphensFound++ > 0) {
                    return false;
                } else if (!Character.isLowerCase(word.charAt(i + 1))) {
                    // We can read ahead because it's not the last position.
                    return false;
                }
            }
            if (punctuationMarks.contains(c) && !isLastPosition) {
                return false;
            }
        }
        return true;
    }
}