package com.leetcode._xx_sample_test;

import java.util.Arrays;
import java.util.function.Function;

/**
 * https://leetcode.com/problems/sample-test/
 * Level: Easy
 * <p>
 * Start time:      2022-03-1? ??:??
 * End time:        2022-03-1? ??:??
 */
public enum Test {
    EXAMPLE_1(new int[]{1,2,2,1}, true),
    ;

    public final ListNode input;

    public final boolean expectedResult;

    Test(int[] list, boolean expectedResult) {
        this.input = ListNodeUtils.buildListNode(list);
        this.expectedResult = expectedResult;
    }

    public void print(boolean realResult) {
//        boolean isTestOk = Arrays.equals(expectedResult, realResult);
        boolean isTestOk = expectedResult == realResult;
//        Function<int[], String> primitivesArrayToString = primitivesArray
//                -> Arrays.stream(primitivesArray).mapToObj(String::valueOf)
//                    .collect(Collectors.joining(", ", "[", "]"));
//        Function<Integer, String> primitiveToString = primitive -> "" + primitive;
        Function<ListNode, String> listNodeToString = ListNodeUtils::listNodeToString;

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
                    var realResult = solution.sampleTest(testData.input);
                    testData.print(realResult);
                });
    }
}
