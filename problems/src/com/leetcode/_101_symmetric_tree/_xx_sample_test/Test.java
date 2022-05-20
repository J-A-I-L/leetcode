package com.leetcode._101_symmetric_tree._xx_sample_test;

import java.util.Arrays;
import java.util.function.Function;

/**
 * 101. Symmetric Tree
 * <br> https://leetcode.com/problems/symmetric-tree/
 * <br> Level: Easy
 * <br>
 * <br> Start time:      2022-05-20 16:45
 * <br> End time:        2022-05-20 17:00
 * <br> Note: Tests not implemented to save time: A new utility class for TreeNodeUtils would have had to be implemented.
 */
public enum Test {
    EXAMPLE_1(new Integer[]{1,2,2,3,4,4,3}, true),
    EXAMPLE_2(new Integer[]{1,2,2,null,3,null,31,2,2,null,3,null,3}, true),
    ;

    public final TreeNode input;

    public final boolean expectedResult;

    Test(Integer[] list, boolean expectedResult) {
        this.input = TreeNodeUtils.buildListNode(list);
        this.expectedResult = expectedResult;
    }

    public void print(boolean realResult) {
//        boolean isTestOk = Arrays.equals(expectedResult, realResult);
        boolean isTestOk = expectedResult == realResult;
//        Function<int[], String> primitivesArrayToString = primitivesArray
//                -> Arrays.stream(primitivesArray).mapToObj(String::valueOf)
//                    .collect(Collectors.joining(", ", "[", "]"));
//        Function<Integer, String> primitiveToString = primitive -> "" + primitive;
        Function<ListNode, String> listNodeToString = TreeNodeUtils::listNodeToString;

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
