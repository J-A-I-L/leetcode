package com.leetcode.longest_common_prefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];

        for (String currentString : strs) {
            result = getCommonPrefix(result, currentString);
        }
        return result;
    }

    private static String getCommonPrefix(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int length = Math.min(s1.length(), s2.length());
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                result.append(s1.charAt(i));
            } else {
                return result.toString();
            }
        }
        return result.toString();
    }
}
