package com.leetcode._342_power_of_four;

import java.util.Arrays;
import java.util.function.Function;

/**
 * 342. Power of Four
 * <br> https://leetcode.com/problems/power-of-four/
 * <br> Level: Easy
 * <br>
 * <br> Start time:      2022-05-01 18:15
 * <br> End time:        2022-05-01 18:35
 */
public enum Test {
    EXAMPLE_1(16, true),
    EXAMPLE_2(5, false),
    EXAMPLE_3(1, true),
    ;

    public final int input;

    public final boolean expectedResult;

    Test(int input, boolean expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    public void print(boolean realResult) {
//        boolean isTestOk = Arrays.equals(expectedResult, realResult);
        boolean isTestOk = expectedResult == realResult;
//        Function<int[], String> primitivesArrayToString = primitivesArray
//                -> Arrays.stream(primitivesArray).mapToObj(String::valueOf)
//                    .collect(Collectors.joining(", ", "[", "]"));
//        Function<Integer, String> primitiveToString = primitive -> "" + primitive;
//        Function<ListNode, String> listNodeToString = ListNodeUtils::listNodeToString;

        String expectedResultString = "" + expectedResult;
        String realResulString = "" + realResult;
        String formattedString = name() + ": " + (isTestOk ? "OK" : "KO") +
                "\nexpected=" + expectedResultString + ",\tgot=" + realResulString +
                '\n';
        System.out.println(formattedString);
    }


    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
                    var realResult = solution.isPowerOfFour(testData.input);
                    testData.print(realResult);
                });
    }
}
