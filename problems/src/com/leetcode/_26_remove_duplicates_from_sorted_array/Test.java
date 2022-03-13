package com.leetcode._26_remove_duplicates_from_sorted_array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Level: Easy
 * <p>
 * Start time:      2022-03-13 18:00
 * End time:        2022-03-13 18:19
 */


public enum Test {
    EXAMPLE_1(new int[]{1,1,2}, 2),
    EXAMPLE_2(new int[]{0,0,1,1,1,2,2,3,3,4}, 5),
    ;

    public final int[]  nums;

    private final int expectedResult;

    Test(int[] nums, int expectedResult) {
        this.nums = nums;
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
                    int realResul = solution.removeDuplicates(testData.nums);
                    testData.print(realResul);
                });
    }
}
