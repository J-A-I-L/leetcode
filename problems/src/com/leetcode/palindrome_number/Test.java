package com.leetcode.palindrome_number;


import java.util.Arrays;

/**
 * Level: Easy
 * https://leetcode.com/problems/palindrome-number/
 */
public enum Test {
    EXAMPLE_1(121, true),
    EXAMPLE_2(-121, false),
    EXAMPLE_3(10, false),
    EXAMPLE_4(1234554321, true),
    EXAMPLE_5(1234564321, false),
    ;

    public final int x;

    private final boolean expectedResult;

    Test(int x, boolean expectedResult) {
        this.x = x;
        this.expectedResult = expectedResult;
    }

    public void print(boolean realResult) {
        String expectedResultString = Boolean.toString(expectedResult);
        String realResulString = Boolean.toString(realResult);

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
                    boolean realResul = solution.isPalindrome(testData.x);
                    testData.print(realResul);
                });
    }
}
