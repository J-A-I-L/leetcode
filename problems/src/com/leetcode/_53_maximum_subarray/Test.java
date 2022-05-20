package com.leetcode._53_maximum_subarray;

import com.leetcode._xx_sample_test.ListNode;
import com.leetcode._xx_sample_test.ListNodeUtils;

import java.util.Arrays;
import java.util.function.Function;

/**
 * 53. Maximum Subarray
 * <br> https://leetcode.com/problems/maximum-subarray/
 * <br> Level: Easy
 * <br>
 * <br> Start time:      2022-05-20 16:15
 * <br> End time:        2022-05-20 16:30
 * after looking _Discussions_ for a better solution, found optimal one: https://leetcode.com/problems/maximum-subarray/discuss/20211/Accepted-O(n)-solution-in-java
 * this problem was discussed by Jon Bentley (Sep. 1984 Vol. 27 No. 9 Communications of the ACM P885)
 *
 *
 */
public enum Test {
    EXAMPLE_3(new int[]{5,4,-1,7,8}, 23),
    EXAMPLE_2(new int[]{1}, 1),
    EXAMPLE_1(new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6),
    ;

    public final int[] nums;

    public final int expectedResult;

    Test(int[] list, int expectedResult) {
        this.nums = list;
        this.expectedResult = expectedResult;
    }

    public void print(int realResult) {
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
                    var realResult = solution.maxSubArray(testData.nums);
                    testData.print(realResult);
                });
    }
}
