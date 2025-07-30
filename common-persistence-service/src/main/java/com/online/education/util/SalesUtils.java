package com.online.education.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class SalesUtils {
    public static List<LocalDate> getLastSixWeeks() {
        List<LocalDate> weeks = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for (int i = 5; i >= 0; i--) {
            weeks.add(today.minusWeeks(i).with(java.time.DayOfWeek.MONDAY)); // Starting from Monday
        }

        return weeks;
    }

    public static List<YearMonth> getLastSixMonths() {
        List<YearMonth> months = new ArrayList<>();
        YearMonth thisMonth = YearMonth.now();

        for (int i = 5; i >= 0; i--) {
            months.add(thisMonth.minusMonths(i));
        }

        return months;
    }
}
