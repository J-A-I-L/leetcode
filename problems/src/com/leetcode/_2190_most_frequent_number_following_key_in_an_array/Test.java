package com.leetcode._2190_most_frequent_number_following_key_in_an_array;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
 * Level: Easy
 * <p>
 * Start time:      2022-03-15 19:38
 * End time:        2022-03-15 20:20
 */
public enum Test {
    EXAMPLE_1(new int[]{1,100,200,1,100}, 1, 100),
    EXAMPLE_2(new int[]{2,2,2,2,3}, 2, 2),
    ;

    public final int[] nums;
    public final int key;

    private final int expectedResult;

    Test(int[] nums, int key, int expectedResult) {
        this.nums = nums;
        this.key = key;
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
                    int realResult = solution.mostFrequent(testData.nums, testData.key);
                    testData.print(realResult);
                });
    }
}
