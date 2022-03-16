package com.leetcode._2185_counting_words_with_a_given_prefix;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/counting-words-with-a-given-prefix/
 * Level: Easy
 * <p>
 * Start time:      2022-03-16 11:15
 * End time:        2022-03-16 11:30
 */
public enum Test {
    EXAMPLE_1(new String[]{"pay","attention","practice","attend"}, "at", 2),
    EXAMPLE_2(new String[]{"leetcode","win","loops","success"}, "code", 0),
    ;

    public final String[] words;
    public final String pref;

    private final int expectedResult;

    Test(String[] words, String pref, int expectedResult) {
        this.words = words;
        this.pref = pref;
        this.expectedResult = expectedResult;
    }

    public void print(int realResult) {
        boolean isTestOk = expectedResult == realResult;

        String expectedResultString = "" + expectedResult;
        String realResulString = "" + "" + realResult;
        String formattedString = name() + ": " + (isTestOk ? "OK" : "KO") +
                "\nexpected=" + expectedResultString + ",\tgot=" + realResulString +
                '\n';
        System.out.println(formattedString);
    }


    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
                    int realResult = solution.prefixCount(testData.words, testData.pref);
                    testData.print(realResult);
                });
    }
}