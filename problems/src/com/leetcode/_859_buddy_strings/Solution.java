package com.leetcode._859_buddy_strings;

class Solution {
    public boolean buddyStrings(String s, String goal) {
        boolean areBuddy = true;
        int swappablePosition1 = -1;
        int swappablePosition2 = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (swappablePosition1 == -1) {
                    swappablePosition1 = i;
                    areBuddy = false;
                } else if (swappablePosition2 == -1) {
                    swappablePosition2 = i;
                    if (s.charAt(swappablePosition2) == goal.charAt(swappablePosition1)
                            && s.charAt(swappablePosition1) == goal.charAt(swappablePosition2)) {
                        areBuddy = true;
                    }
                } else {
//                    areBuddy = false;
                    return false;
                }
            }
        }
        return areBuddy;
    }
}
