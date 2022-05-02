package com.leetcode._1909_remove_one_element_to_make_the_array_strictly_increasing;

import java.util.Arrays;

/**
 * 1909. Remove One Element to Make the Array Strictly Increasing
 * <br> https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
 * <br> Level: Easy
 * <br>
 * <br> Start time:      2022-05-01 18:47
 * <br> End time:        2022-05-02 17:25 [...]
 */
public enum Test {
    EXAMPLE_5(new int[]{1,1}, true),
    EXAMPLE_1(new int[]{1,2,10,5,7}, true),
    EXAMPLE_2(new int[]{2,3,1,2}, false),
    EXAMPLE_3(new int[]{1,1,1}, false),
    EXAMPLE_4(new int[]{1,2,10,5,7, 15, 9, 11}, false),
    ;

    public final int[] nums;

    public final boolean expectedResult;

    Test(int[] nums, boolean expectedResult) {
        this.nums = nums;
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
                    var realResult = solution.canBeIncreasing(testData.nums);
                    testData.print(realResult);
                });
    }
}
