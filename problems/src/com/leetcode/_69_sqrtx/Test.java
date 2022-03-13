package com.leetcode._69_sqrtx;


import java.util.Arrays;

/**
 * https://leetcode.com/problems/sqrtx/
 * Level: Easy
 * <p>
 * Start time:      2022-03-13 16:24
 * End time:        2022-03-13 17:22
 */

public enum Test {
    EXAMPLE_1(4, 2),
    EXAMPLE_2(8, 2),
    EXAMPLE_3(32, 5),
    EXAMPLE_4(1, 1),
    EXAMPLE_5(0, 0),
    EXAMPLE_6(2147395599, 46339),
    ;

    public final int x;

    private final int expectedResult;

    Test(int x, int expectedResult) {
        this.x = x;
        this.expectedResult = expectedResult;
    }

    public void print(int realResult) {
        boolean isTestOk = expectedResult == realResult;

        String expectedResultString = Integer.toString(expectedResult);
        String realResulString = Integer.toString(realResult);
        String formattedString = name() + ": " + (isTestOk ? "OK" : "KO") +
                "\nexpected=" + expectedResultString + ",\tgot=" + realResulString +
                '\n';
        System.out.println(formattedString);
    }


    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
                    int realResul = solution.mySqrt(testData.x);
                    testData.print(realResul);
                });
    }
}
