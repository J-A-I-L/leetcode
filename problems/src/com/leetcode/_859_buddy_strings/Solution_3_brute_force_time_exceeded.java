package com.leetcode._859_buddy_strings;

import java.util.Arrays;

class Solution_3_brute_force_time_exceeded {
    public boolean buddyStrings(String s, String goal) {
        char[] sArray = s.toCharArray();
        char[] goalArray = goal.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            for (int j = i+1; j < sArray.length; j++) {
                swapPositions(sArray, i, j);
                if (Arrays.equals(sArray, goalArray)) {
                    return true;
                }
                swapPositions(sArray, i, j);
            }
        }
        return false;
    }

    private void swapPositions(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}
