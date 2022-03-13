package com.leetcode._2194_cells_in_a_range_on_an_excel_sheet._26_remove_duplicates_from_sorted_array;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
 * Level: Easy
 * <p>
 * Start time:      2022-03-13 19:12
 * Noticed Rows and columns are between A~Z and 1~9. at 2022-03-13 19:40
 * End time:        2022-03-13 19:49  -> 9 minutes more
 */


public enum Test {
    EXAMPLE_1("K1:L2", new String[]{"K1", "K2", "L1", "L2"}),
    EXAMPLE_2("A1:F1", new String[]{"A1","B1","C1","D1","E1","F1"}),
    ;

    public final String s;

    private final String[] expectedResult;

    Test(String s, String[] expectedResult) {
        this.s = s;
        this.expectedResult = expectedResult;
    }

    public void print(String[] realResult) {
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
                    List<String> realResul = solution.cellsInRange(testData.s);
                    testData.print(realResul.toArray(new String[0]));
                });
    }
}
