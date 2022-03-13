package com.leetcode._1185_day_of_the_week;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("EEEE")
                .toFormatter(Locale.US);
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.format(dateTimeFormatter);
    }
}