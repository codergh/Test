package com.procurement.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class DateConverter {

    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    /* Timezone UTC */
    private static final String TIMEZONE_UTC = "UTC";

    private DateConverter(){}

    public static Date toDate(String dateString, String pattern) {
        if (dateString == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        sdf.setTimeZone(TimeZone.getTimeZone(TIMEZONE_UTC));
        try {
            return sdf.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException("Got error when convert from String to Date");
        }
    }

    /**
     * Convert date 'String' to 'Date' by Timezone
     *
     * @param dateString
     * @param pattern
     * @param timezone
     * @return
     */
    public static Date toDate(String dateString, String pattern, TimeZone timezone) {
        if (dateString == null) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        if (timezone == null) {
            sdf.setTimeZone(TimeZone.getTimeZone(TIMEZONE_UTC));
        } else {
            sdf.setTimeZone(timezone);
        }
        try {
            return sdf.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException("Got error when convert from String to Date");
        }
    }
}
