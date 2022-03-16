package com.leetcode._66_plus_one;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/plus-one/
 * Level: Easy
 * <p>
 * Start time:      2022-03-16 12:10
 * End time:        2022-03-16 12:33
 */
public enum Test {
    EXAMPLE_1(new int[]{1, 2, 3}, new int[]{1, 2, 4}),
    EXAMPLE_2(new int[]{4,3,2,1}, new int[]{4,3,2,2}),
    EXAMPLE_3(new int[]{9}, new int[]{1, 0}),
    ;

    public final int[] input;

    private final int[] expectedResult;

    Test(int[] input, int[] expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    public void print(int[] realResult) {
        boolean isTestOk = Arrays.equals(expectedResult, realResult);
//        boolean isTestOk = expectedResult == realResult;
        Function<int[], String> primitivesArrayToString = primitivesArray
                -> Arrays.stream(primitivesArray).mapToObj(String::valueOf)
                    .collect(Collectors.joining(", ", "[", "]"));
//        Function<Integer, String> primitiveToString = primitive -> "" + primitive;

        String expectedResultString = primitivesArrayToString.apply(expectedResult);
        String realResulString = primitivesArrayToString.apply(realResult);
        String formattedString = name() + ": " + (isTestOk ? "OK" : "KO") +
                "\nexpected=" + expectedResultString + ",\tgot=" + realResulString +
                '\n';
        System.out.println(formattedString);
    }


    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
                    int[] realResult = solution.plusOne(testData.input);
                    testData.print(realResult);
                });
    }
}
