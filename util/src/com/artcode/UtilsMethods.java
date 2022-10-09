package com.artcode;

import java.time.Duration;
import java.time.LocalDate;

public class UtilsMethods {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static long getDaysBetweenDates(int startYear, int startDay, int startMonth, int endYear, int endDay, int endMonth){
        LocalDate d1 = LocalDate.of(startYear, startMonth, startDay);
        LocalDate d2 = LocalDate.of(endYear, endMonth, endDay);
        Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
        return diff.toDays();
    }
    
}
