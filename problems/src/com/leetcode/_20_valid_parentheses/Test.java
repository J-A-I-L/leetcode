package com.leetcode._20_valid_parentheses;

/**
 * Level: Easy
 * https://leetcode.com/problems/valid-parentheses/
 * Start time:  2022-03-13 12:00
 * End time:    2022-03-13 12:58
 */
public class Test {
    public static void main(String[] args) {
        String s;
        boolean expectdResult;

        print("()", true);
        print("()[]{}", true);
        print("(]", false);
        print("([)]", false);


    }

    private static void print(String s, boolean expectdResult) {
        boolean gotResult = new Solution().isValid(s);
        System.out.println(gotResult == expectdResult ? "OK" : "KO" + "\tExpected: " + expectdResult + ", Got: " + gotResult + "\t" +s);
    }
}
