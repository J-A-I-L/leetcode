package com.leetcode._2185_counting_words_with_a_given_prefix;

import java.util.Arrays;

class Solution_1 {
    public int prefixCount(String[] words, String pref) {
        long result = Arrays.stream(words).parallel()
                .filter(s -> s.startsWith(pref))
                .count();
        return (int) result;
    }
}
