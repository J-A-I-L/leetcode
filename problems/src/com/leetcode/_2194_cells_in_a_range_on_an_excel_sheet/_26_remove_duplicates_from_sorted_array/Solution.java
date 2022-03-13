package com.leetcode._2194_cells_in_a_range_on_an_excel_sheet._26_remove_duplicates_from_sorted_array;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> cellsInRange(String s) {
//        String[] cells = s.split(":");
//        String rx = "\\d+";
//        String topColumn = cells[0].split("\\d+")[0];
//        String topRow = cells[0].substring(topColumn.length());
//
//        String bottomColumn = cells[1]. split("\\d+")[0];
//        String bottomRow = cells[0].substring(bottomColumn.length());;

        char topColumn = s.charAt(0);
        char topRow =s.charAt(1);
        char bottomColumn = s.charAt(3);
        char bottomRow =s.charAt(4);

        List<String> result = new LinkedList<>();
        for (char c = topColumn; c <= bottomColumn; c++) {
            for (char i = topRow; i <= bottomRow; i++) {
                result.add("" + c + i);
            }
        }

        return result;
    }
}