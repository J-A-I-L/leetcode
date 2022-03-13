package com.leetcode._937_reorder_data_in_log_files;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> orderedLogs = new ArrayList<>(Arrays.stream(logs).toList());

        Comparator<String> logComparator = (s1, s2) -> {
            if (!isDigitLog(s1) && isDigitLog(s2)) {
                // The letter-logs come before all digit-logs.
                return -1;
            } else if (isDigitLog(s1) && !isDigitLog(s2)) {
                // The letter-logs come before all digit-logs.
                return 1;
            } else if (!isDigitLog(s1) && !isDigitLog(s2)) {
                // The letter-logs are sorted lexicographically by their contents.
                // If their contents are the same, then sort them lexicographically by their identifiers.
                String s1Content = s1.substring(s1.indexOf(" ") + 1);
                String s2Content = s2.substring(s2.indexOf(" ") + 1);
                if (s1Content.compareTo(s2Content) != 0) {
                    return s1Content.compareTo(s2Content);
                } else {
                    return s1.compareTo(s2);
//                    return s1.substring(0, s1.indexOf(" ") + 1).compareTo(s2.substring(0, s2.indexOf(" ") + 1));
                }

            } else {
                // The digit-logs maintain their relative ordering.
                return 0;
            }
        };

        orderedLogs = orderedLogs
                .stream()
                .sorted(logComparator)
                .collect(Collectors.toList());
        return orderedLogs.toArray(String[]::new);
    }

    private boolean isDigitLog(String s) {
        return s.split(" ")[1].matches("\\d+");
    }
}
