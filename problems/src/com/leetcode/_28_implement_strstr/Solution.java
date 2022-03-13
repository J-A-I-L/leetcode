package com.leetcode._28_implement_strstr;

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle==null/* || needle.length()==0*/) {
            return 0;
        }

        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        for (int i = 0; i < haystackChars.length-needleChars.length+1; i++) {
            boolean isFound = true;
            for (int j = 0; j < needleChars.length; j++) {
                if (haystackChars[i + j] != needleChars[j]) {
                    isFound = false;
                    break;
                }
            }
            if (isFound) {
                return i;
            }
        }

        return -1;
    }
}