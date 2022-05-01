package com.leetcode._231_power_of_two;

import java.util.Arrays;

/**
 * 231. Power of Two
 * <br> https://leetcode.com/problems/power-of-two/
 * <br> Level: Easy
 * <br>
 * <br> Start time:      2022-05-01 18:15
 * <br> End time:        2022-05-01 18:35
 */
public enum Test {
    EXAMPLE_1(1, true),
    EXAMPLE_2(16, true),
    EXAMPLE_3(3, false),
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
                    var realResult = solution.isPowerOfTwo(testData.input);
                    testData.print(realResult);
                });
    }
}
