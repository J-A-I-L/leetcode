package com.leetcode._28_implement_strstr;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/implement-strstr/
 * Level: Easy
 * <p>
 * Start time:      2022-03-13 17:34
 * End time:        2022-03-13 17:55
 */

public enum Test {
    EXAMPLE_1("hello", "ll", 2),
    EXAMPLE_2("aaaaa", "bba", -1),
    EXAMPLE_3("", "", 0),
    EXAMPLE_4("a", "a", 0),
    ;

    public final String haystack;
    public final String needle;

    private final int expectedResult;

    Test(String haystack, String needle, int expectedResult) {
        this.haystack = haystack;
        this.needle = needle;
        this.expectedResult = expectedResult;
    }

    public void print(int realResult) {
        boolean isTestOk = expectedResult == realResult;

//        String expectedResultString = Integer.toString(expectedResult);
//        String realResulString = Integer.toString(realResult);
        String formattedString = name() + ": " + (isTestOk ? "OK" : "KO") +
                "\nexpected=" + expectedResult + ",\tgot=" + realResult +
                '\n';
        System.out.println(formattedString);
    }


    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
                    int realResul = solution.strStr(testData.haystack, testData.needle);
                    testData.print(realResul);
                });
    }
}
