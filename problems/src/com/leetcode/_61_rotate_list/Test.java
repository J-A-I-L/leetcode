package com.leetcode._61_rotate_list;

import java.util.*;

public enum Test {
    EXAMPLE_1(new int[]{1, 2, 3, 4, 5}, 2, new int[]{4, 5, 1, 2, 3}),
    EXAMPLE_2(new int[]{0, 1, 2}, 4, new int[]{2, 0, 1}),
    EXAMPLE_3(new int[]{}, 0, new int[]{}),
    EXAMPLE_4(new int[]{}, 100, new int[]{}),
    EXAMPLE_5(new int[]{1, 2, 3, 4, 5}, 0, new int[]{1, 2, 3, 4, 5}),
    EXAMPLE_6(new int[]{1, 2}, 1, new int[]{2, 1}),
    ;

    public final ListNode head;
    public final int k;

    private final ListNode expectedResult;

    Test(int[] elementsAsIntArray, int k, int[] expectedResultAsIntArray) {
        this.head = ListNodeUtils.buildListNode(elementsAsIntArray);
        this.k = k;
        this.expectedResult = ListNodeUtils.buildListNode(expectedResultAsIntArray);
    }

    public void print(ListNode realResult) {
        String expectedResultString = ListNodeUtils.listNodeToString(expectedResult);
        String realResulString = ListNodeUtils.listNodeToString(realResult);

        String formattedString = name() + ":" +
                "\nexpected=" + expectedResultString +
                ",\tgot=" + realResulString +
                '\n' + (expectedResultString.equals(realResulString) ? "OK" : "KO") +
                '\n';

        System.out.println(formattedString);
    }


    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
//                    System.out.println(ListNodeUtils.listNodeToString(testData.head));
//                    System.out.println(ListNodeUtils.listNodeToString(solution.reverse(testData.head)));
                    ListNode realResultListNode = solution.rotateRight(testData.head, testData.k);
                    testData.print(realResultListNode);
                });
    }
}
