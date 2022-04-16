package com.leetcode._58_length_of_last_word;

import com.leetcode._xx_sample_test.ListNode;
import com.leetcode._xx_sample_test.ListNodeUtils;

import java.util.Arrays;
import java.util.function.Function;

/**
 * 58. Length of Last Word <p>
 * https://leetcode.com/problems/length-of-last-word/ <p>
 * Level: Easy <p>
 *
 * Start time:      2022-04-16 21:57    <p>
 * End time:        2022-04-16 22:07
 */
public enum Test {
    EXAMPLE_1("Hello World", 5),
    EXAMPLE_2("   fly me   to   the moon  ", 4),
    EXAMPLE_3("luffy is still joyboy", 6),
    EXAMPLE_4("   fly   ", 3),
    EXAMPLE_5("      ", 0),
    ;

    public final String input;

    public final int expectedResult;

    Test(String input, int expectedResult) {
        this.input = input;
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
                    var realResult = solution.lengthOfLastWord(testData.input);
                    testData.print(realResult);
                });
    }
}
