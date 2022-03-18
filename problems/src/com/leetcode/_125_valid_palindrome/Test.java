package com.leetcode._125_valid_palindrome;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-palindrome/
 * Level: Easy
 * <p>
 * Start time:      2022-03-18 15:15
 * End time:        2022-03-18 15:37
 */
public enum Test {
    EXAMPLE_1("A man, a plan, a canal: Panama", true),
    EXAMPLE_2("race a car", false),
    EXAMPLE_3(" ", true),
    EXAMPLE_4("", true),
    EXAMPLE_5("a11a", true),
    EXAMPLE_6("a1b1a", true),
    ;

    public final String input;

    public final boolean expectedResult;

    Test(String s, boolean expectedResult) {
        this.input = s;
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
                    boolean realResult = solution.isPalindrome(testData.input);
                    testData.print(realResult);
                });
    }
}
