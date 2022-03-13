package com.leetcode._2200_find_all_k_distant_indices_in_an_array._26_remove_duplicates_from_sorted_array;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/
 * Level: Easy
 * <p>
 * Start time:      2022-03-13 18:31
 * End time:        2022-03-13 19:05
 */


public enum Test {
    EXAMPLE_1(new int[]{3, 4, 9, 1, 3, 9, 5}, 9, 1, new int[]{1, 2, 3, 4, 5, 6}),
    EXAMPLE_2(new int[]{2, 2, 2, 2, 2}, 2, 2, new int[]{0, 1, 2, 3, 4}),
    EXAMPLE_3(new int[]{222,151,842,244,103,736,219,432,565,216,36,198,10,367,778,111,307,460,92,622,750,36,559,983,782,432,312,111,676,179,44,86,766,371,746,905,850,170,892,80,449,932,295,875,259,556,730,441,153,869},
            153,
            19,
            new int[]{29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49}),
    ;

    public final int[] nums;
    public final int key;
    public final int k;

    private final int[] expectedResult;

    Test(int[] nums, int key, int k, int[] expectedResult) {
        this.nums = nums;
        this.key = key;
        this.k = k;
        this.expectedResult = expectedResult;
    }

    ;

    public void print(int[] realResult) {
        boolean isTestOk = Arrays.equals(expectedResult, realResult);

        String expectedResultString = Arrays.toString(expectedResult);
        String realResulString = Arrays.toString(realResult);
        String formattedString = name() + ": " + (isTestOk ? "OK" : "KO") +
                "\nexpected=" + expectedResultString + ",\tgot=" + realResulString +
                '\n';
        System.out.println(formattedString);
    }


    public static void main(String[] args) {
        final Solution solution = new Solution();
        Arrays.stream(Test.values())
                .forEach(testData -> {
                    List<Integer> realResul = solution.findKDistantIndices(testData.nums, testData.key, testData.k);
                    testData.print(realResul.stream().mapToInt(Integer::intValue).toArray());
                });
    }
}
