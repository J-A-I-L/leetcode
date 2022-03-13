package com.leetcode.merge_two_sorted_lists;

import java.util.Arrays;

/**
 * Level: Easy
 * https://leetcode.com/problems/roman-to-integer/
 * Start time:  2022-03-13 13:45
 * End time:    2022-03-13 14:19    (4 minutos tarde)
 */
public enum Test {
    EXAMPLE_1(new int[]{1, 2, 4}, new int[]{1, 3, 4}, new int[]{1, 1, 2, 3, 4, 4}),
    EXAMPLE_2(new int[]{}, new int[]{}, new int[]{}),
    EXAMPLE_3(new int[]{}, new int[]{0}, new int[]{0}),
    ;

    public final ListNode list1;
    public final ListNode list2;
    public final ListNode expectedResult;

    Test(int[] list1, int[] list2, int[] expectedResult) {
        this.list1 = ListNodeUtils.buildListNode(list1);
        this.list2 = ListNodeUtils.buildListNode(list2);
        this.expectedResult = ListNodeUtils.buildListNode(expectedResult);
    }

    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
                    System.out.println(ListNodeUtils.listNodeToString(testData.list1));
                    System.out.println(ListNodeUtils.listNodeToString(testData.list2));
                    ListNode gotResult = solution.mergeTwoLists(testData.list1, testData.list2);
                    System.out.println(ListNodeUtils.listNodeToString(gotResult));
                    testData.print(gotResult);
                });
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
}
