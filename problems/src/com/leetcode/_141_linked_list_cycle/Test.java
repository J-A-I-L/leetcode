package com.leetcode._141_linked_list_cycle;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 * Level: Easy
 * <p>
 * Start time:      2022-03-24 17:17
 * End time:        2022-03-24 17:24
 */
public enum Test {
    EXAMPLE_1(new int[]{3,2,0,-4}, 1, true),
    EXAMPLE_2(new int[]{1, 2}, 0, true),
    EXAMPLE_3(new int[]{1}, -1, false),
    ;

    public final ListNode input;

    public final boolean expectedResult;

    Test(int[] list, int pos, boolean expectedResult) {
        this.input = ListNodeUtils.buildListNode(list);
        if (pos > 0) {
            ListNode current = this.input;
            while (pos > 0) {
                current = current.next;
                pos--;
            }
            ListNodeUtils.getTail(this.input).next = current;
        }

        this.expectedResult = expectedResult;
    }

    public void print(boolean realResult) {
//        boolean isTestOk = Arrays.equals(expectedResult, realResult);
        boolean isTestOk = expectedResult == realResult;
        Function<int[], String> primitivesArrayToString = primitivesArray
                -> Arrays.stream(primitivesArray).mapToObj(String::valueOf)
                    .collect(Collectors.joining(", ", "[", "]"));
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
                    boolean realResult = solution.hasCycle(testData.input);
                    testData.print(realResult);
                });
    }
}
