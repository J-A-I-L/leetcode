package com.leetcode._20_valid_parentheses;

class Solution_1 {
    public boolean isValid(String s) {
        int numOfRoundBrackets = 0;
        int numOfRCurlyBrackets = 0;
        int numOfSquareBrackets = 0;

        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(' -> numOfRoundBrackets++;
                case ')' -> numOfRoundBrackets--;
                case '{' -> numOfRCurlyBrackets++;
                case '}' -> numOfRCurlyBrackets--;
                case '[' -> numOfSquareBrackets++;
                case ']' -> numOfSquareBrackets--;
            }
        }
        return numOfRoundBrackets == 0 && numOfSquareBrackets == 0 && numOfRCurlyBrackets == 0;
    }
}