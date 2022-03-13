package com.leetcode.stone_game_vi;


import java.util.Arrays;

public enum Test {
    EXAMPLE_1(new int[]{1, 3}, new int[]{2, 1}, 1),
    EXAMPLE_2(new int[]{1, 2}, new int[]{3, 1}, 0),
    EXAMPLE_3(new int[]{2, 4, 3}, new int[]{1, 6, 7}, -1),
    ;

    public final int[] aliceValues;
    public final int[] bobValues;

    private final int expectedResult;

    Test(int[] aliceValues, int[] bobValues, int expectedResult) {
        this.aliceValues = aliceValues;
        this.bobValues = bobValues;
        this.expectedResult = expectedResult;
    }

    public void print(int realResult) {
        String expectedResultString = Integer.toString(expectedResult);
        String realResulString = Integer.toString(realResult);

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
                    int realResul = solution.stoneGameVI(testData.aliceValues, testData.bobValues);
                    testData.print(realResul);
                });
    }
}
