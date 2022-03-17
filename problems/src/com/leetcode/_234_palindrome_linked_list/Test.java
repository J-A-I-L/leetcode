package com.leetcode._234_palindrome_linked_list;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * Level: Easy
 * <p>
 * Start time:      2022-03-17 19:12
 * End time:        2022-03-17 19:56
 */
public enum Test {
    EXAMPLE_1(new int[]{1,2,2,1}, true),
    EXAMPLE_2(new int[]{1,2}, false),
    ;

    public final ListNode head;

    public final boolean expectedResult;

    Test(int[] list, boolean expectedResult) {
        this.head = ListNodeUtils.buildListNode(list);
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
                    boolean realResult = solution.isPalindrome(testData.head);
                    testData.print(realResult);
                });
    }
}
