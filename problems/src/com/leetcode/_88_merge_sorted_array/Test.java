package com.leetcode._88_merge_sorted_array;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 * Level: Easy
 * <p>
 * Start time:      2022-03-22 ??:??
 * End time:        2022-03-22 ??:??
 */
public enum Test {
    EXAMPLE_1(new int[]{1,2,3,0,0,0}, 3, new int[]{2, 5, 6}, 3, new int[]{1,2,2,3,5,6}),
    EXAMPLE_2(new int[]{1}, 1, new int[]{}, 0, new int[]{1}),
    EXAMPLE_3(new int[]{0}, 0, new int[]{1}, 1, new int[]{1}),
    EXAMPLE_4(new int[]{2, 0}, 1, new int[]{1}, 1, new int[]{1, 2}),
    ;

    public final int[] nums1;
    public final int m;
    public final int[] nums2;
    public final int n;

    public final int[] expectedResult;

    Test(int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
        this.nums1 = nums1;
        this.m = m;
        this.nums2 = nums2;
        this.n = n;
        this.expectedResult = expectedResult;
    }

    public void print(int[] realResult) {
        boolean isTestOk = Arrays.equals(expectedResult, realResult);
//        boolean isTestOk = expectedResult == realResult;
        Function<int[], String> primitivesArrayToString = primitivesArray
                -> Arrays.stream(primitivesArray).mapToObj(String::valueOf)
                    .collect(Collectors.joining(", ", "[", "]"));
//        Function<Integer, String> primitiveToString = primitive -> "" + primitive;
//        Function<ListNode, String> listNodeToString = ListNodeUtils::listNodeToString;

        String expectedResultString = primitivesArrayToString.apply(expectedResult);
        String realResulString = primitivesArrayToString.apply(realResult);
        String formattedString = name() + ": " + (isTestOk ? "OK" : "KO") +
                "\nexpected=" + expectedResultString + ",\tgot=" + realResulString +
                '\n';
        System.out.println(formattedString);
    }


    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
                    /*int[] realResult = */solution.merge(testData.nums1, testData.m, testData.nums2, testData.n);
                    testData.print(testData.nums1);
                });
    }
}
