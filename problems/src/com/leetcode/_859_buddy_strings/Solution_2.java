package com.leetcode._859_buddy_strings;

class Solution_2 {
    public boolean buddyStrings(String s, String goal) {
        int swappableLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isCharInStringAtAnotherPosition(ch, goal, i)) {
                swappableLetters++;
            } else if (ch != goal.charAt(i)) {
                return false;
            }

        }

        return swappableLetters == 2;
    }

    private boolean isCharInStringAtAnotherPosition(char ch, String s, int anotherPosition) {
        for (int i = 0; i < s.length(); i++) {
            if (ch == s.charAt(i) && i != anotherPosition) {
                return true;
            }
        }
        return false;
    }
}
