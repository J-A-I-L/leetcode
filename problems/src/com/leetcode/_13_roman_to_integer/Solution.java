package com.leetcode._13_roman_to_integer;

class Solution {
    public int romanToInt(String s) {
        int result = 0;

        int lastRomanDigitValue = 0;

        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currentRomanDigitValue = translate(c);
            if (lastRomanDigitValue > currentRomanDigitValue) {
                result -= currentRomanDigitValue;
            } else {
                result += currentRomanDigitValue;
            }
            lastRomanDigitValue = currentRomanDigitValue;
        }

        return result;
    }

    private int translate(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X'->  10;
            case 'L'->  50;
            case 'C'->  100;
            case 'D'->  500;
            case 'M'->  1000;
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
    }
}