package com.leetcode._2185_counting_words_with_a_given_prefix._2190_most_frequent_number_following_key_in_an_array;

class Solution_1 {
    public int prefixCount(String[] words, String pref) {
        int result = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                result++;
            }
        }
        return result;
    }
}
