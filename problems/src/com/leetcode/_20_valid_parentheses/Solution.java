package com.leetcode._20_valid_parentheses;

import java.util.EmptyStackException;
import java.util.Stack;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Solution {
    public boolean isValid(String s) {
        final Predicate<Character> isOpeningBracket = ch -> '(' == ch || '{' == ch || '[' == ch;
        final BiPredicate<Character, Character> areRoundBracket = (chOpen, chClose) -> '(' == chOpen && ')' == chClose;
        final BiPredicate<Character, Character> areCurlyBracket = (chOpen, chClose) -> '{' == chOpen && '}' == chClose;
        final BiPredicate<Character, Character> areSquareBracket = (chOpen, chClose) -> '[' == chOpen && ']' == chClose;

        Stack<Character> bracketsStack = new Stack<>();

        try {
            int length = s.length();
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                if (isOpeningBracket.test(c)) {
                    bracketsStack.push(c);
                } else {
                    char topChar = bracketsStack.peek();
                    if (areRoundBracket.test(topChar, c) || areCurlyBracket.test(topChar, c) || areSquareBracket.test(topChar, c)) {
                        bracketsStack.pop();
                    } else {
                        return false;
                    }
                }
            }
            return bracketsStack.isEmpty();
        } catch (EmptyStackException empty) {
            return false;
        }
    }
}