package com.leetcode._190_reverse_bits;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sample-test/
 * Level: Easy
 * <p>
 * Start time:      2022-03-24 17:44
 * End time:        2022-03-24 18:22
 */
public enum Test {
    EXAMPLE_1(43261596, 964176192),
    EXAMPLE_2(-3, -1073741825),
    ;

    public final int input;

    public final int expectedResult;

    Test(int input, int expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    public void print(int realResult) {
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
                    int realResult = solution.reverseBits(testData.input);
                    testData.print(realResult);
                });
    }
}
