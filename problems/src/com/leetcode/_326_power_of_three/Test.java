package com.leetcode._326_power_of_three;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/power-of-three/
 * Level: Easy
 * <p>
 * Start time:      2022-03-18 14:54
 * End time:        2022-03-18 15:14
 */
public enum Test {
    EXAMPLE_1(27, true),
    EXAMPLE_2(0, false),
    EXAMPLE_3(9, true),
    EXAMPLE_4(10, false),
    EXAMPLE_5(-3, false),
    ;

    public final int input;

    public final boolean expectedResult;

    Test(int n, boolean expectedResult) {
        this.input = n;
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
                    boolean realResult = solution.isPowerOfThree(testData.input);
                    testData.print(realResult);
                });
    }
}
