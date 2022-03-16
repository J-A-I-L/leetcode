package com.leetcode._2185_counting_words_with_a_given_prefix._2190_most_frequent_number_following_key_in_an_array;

import java.util.Arrays;

class Solution {
    public int prefixCount(String[] words, String pref) {
        long result = Arrays.stream(words).parallel()
                .filter(s -> s.startsWith(pref))
                .count();
        return (int) result;
    }
}
