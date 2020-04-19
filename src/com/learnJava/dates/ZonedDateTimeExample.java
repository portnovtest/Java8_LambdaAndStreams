package com.learnJava.dates;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {

        var zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime : " + zonedDateTime);
        System.out.println("getOffset : " + zonedDateTime.getOffset());
        System.out.println("Zone Id : " + zonedDateTime.getZone());

        //System.out.println("Available Zones: " + ZoneId.getAvailableZoneIds());
//        ZoneId.getAvailableZoneIds().stream()
//                .forEach(System.out::println);
        System.out.println("No of Zones : " + ZoneId.getAvailableZoneIds().size());

        //CST,EST,MST,PST
        System.out.println("Chicago CST : " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("Detroit EST : " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("LA PST : " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("Denver MST : " + ZonedDateTime.now(ZoneId.of("America/Denver")));
        System.out.println("ZonedDayTime using clock : " + ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
        System.out.println("Detroit : " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
        System.out.println("Detroit : " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("ofInstant : " + localDateTime2);

        /**
         * Convert from localDateTime, instant to ZonedLocalDate and Time
         */

        LocalDateTime localDateTime3 = LocalDateTime.now();
        System.out.println("localDateTime3 : " + localDateTime3);

        ZonedDateTime zonedDateTime1 = localDateTime3.atZone(ZoneId.of("America/Chicago"));
        System.out.println("zonedDateTime1 : " + zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Detroit"));
        System.out.println("zonedDateTime2 : " + zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime3.atOffset(ZoneOffset.ofHours(-6));
        System.out.println("offsetDateTime : " + offsetDateTime);
    }
}
