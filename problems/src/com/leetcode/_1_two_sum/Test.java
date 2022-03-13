package com.leetcode._1_two_sum;

import java.util.Arrays;

public enum Test {
    EXAMPLE_1(new int[]{2, 7, 11, 15}, 9, new int[]{1, 0}),
    EXAMPLE_2(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
    EXAMPLE_3(new int[]{3, 3}, 6, new int[]{0, 1}),
    ;

    public final int[] nums;
    public final int target;

    private final int[] expectedResult;

    Test(int[] nums, int target, int[] expectedResult) {
        this.nums = nums;
        this.target = target;
        this.expectedResult = expectedResult;
    }

    public void print(int[] realResult) {
        StringBuilder formattedString = new StringBuilder();
        formattedString.append(name()).append(":")
                       .append("\nexpected=").append(Arrays.toString(expectedResult))
                       .append(",\tgot=").append(Arrays.toString(realResult));

        Arrays.sort(realResult);
        Arrays.sort(expectedResult);
        formattedString.append('\n')
                       .append(Arrays.equals(expectedResult, realResult) ? "OK" : "KO")
                       .append('\n');

        System.out.println(formattedString);
    }

    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
                    int[] realResult = solution.twoSum(testData.nums, testData.target);
                    testData.print(realResult);
                });
    }
}
