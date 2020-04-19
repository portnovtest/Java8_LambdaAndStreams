package com.learnJava.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate " + localDate);

        LocalDate localDate1 = LocalDate.of(2020, 4, 19);
        System.out.println("localDate " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2020, 365);
        System.out.println("localDate " + localDate2);

        /**
         * Get values from localDate
         */

        System.out.println("getMonth : " + localDate.getMonth());
        System.out.println("getMonthValue : " + localDate.getMonthValue());
        System.out.println("getDayOfTheWeek : " + localDate.getDayOfWeek());
        System.out.println("getDayOfTheYear : " + localDate.getDayOfYear());
        System.out.println("Day of Month Using Get: " + localDate.get(ChronoField.DAY_OF_MONTH));


        /**
         * Modifying Local Date
         */

        System.out.println("plusDays : " + localDate.plusDays(2));
        System.out.println("plusMonths : " + localDate.plusMonths(2));
        System.out.println("minusDays : " + localDate.minusDays(2));
        System.out.println("withYear : " + localDate.withYear(2019));
        System.out.println("withChronoField : " + localDate.with(ChronoField.YEAR, 2021));
        System.out.println("withTemporalAdjusters : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println("ChronoUnit minus : " + localDate.minus(1, ChronoUnit.YEARS));

        /**
         * Unsupported
         */
        //System.out.println("ChronoUnit minus : " + localDate.minus(1, ChronoUnit.MINUTES));
        System.out.println("isSupported : " + localDate.isSupported(ChronoUnit.MINUTES));


        /**
         * Additional Support methods
         */

        System.out.println("leapYear " + localDate.isLeapYear());
        System.out.println("leapYear " + LocalDate.ofYearDay(2020, 1).isLeapYear());
        //localDate = 4-18-20
        //localDate = 4-19-20
        System.out.println("isEqual " + localDate.isEqual(localDate1));
        System.out.println("isBefore " + localDate.isBefore(localDate1));
        System.out.println("isAfter " + localDate1.isAfter(localDate));
    }
}
