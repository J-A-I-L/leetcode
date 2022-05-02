package com.leetcode._414_third_maximum_number;

import java.util.Arrays;

/**
 * 414. Third Maximum Number
 * <br> https://leetcode.com/problems/third-maximum-number/
 * <br> Level: Easy
 * <br>
 * <br> Start time:      2022-05-02 18:54
 * <br> End time:        2022-05-02 19:39
 */
public enum Test {
    EXAMPLE_1(new int[]{3, 2, 1}, 1),
    EXAMPLE_2(new int[]{1, 2}, 2),
    EXAMPLE_3(new int[]{2, 2, 3, 1}, 1),
    EXAMPLE_4(new int[]{5, 2, 2}, 5),
    EXAMPLE_5(new int[]{1, 2, -2147483648}, -2147483648),
    EXAMPLE_6(new int[]{-2147483648, -2147483648, -2147483648}, -2147483648),
    EXAMPLE_7(new int[]{-2147483648, -2147483648}, -2147483648),
    EXAMPLE_8(new int[]{1, -2147483648, 2}, -2147483648),
    ;

    public final int[] nums;

    public final int expectedResult;

    Test(int[] nums, int expectedResult) {
        this.nums = nums;
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
                    var realResult = solution.thirdMax(testData.nums);
                    testData.print(realResult);
                });
    }
}
