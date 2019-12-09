package com.example.myapplicationhelloworld.utils;

import java.math.BigDecimal;

public class TImeUnitTool {
    public static double year_day(String v) {
        double str = Double.valueOf(v) * 365;
        return str;
    }

    public static double day_year(String v) {
        double str = Double.valueOf(v) / 365;
        return str;
    }

    public static double week_day(String v) {
        double str = Double.valueOf(v) * 7;
        return str;
    }

    public static double day_week(String v) {
        double str = Double.valueOf(v) / 7;
        return str;
    }

    public static double day_day(String v) {
        double str = Double.valueOf(v);
        return str;
    }

    public static double hour_day(String v) {
        double str = Double.valueOf(v) / 24;
        return str;
    }

    public static double day_hour(String v) {
        double str = Double.valueOf(v) * 24;
        return str;
    }

    public static double minute_day(String v) {
        double str = Double.valueOf(v) / 60 / 24;
        return str;
    }

    public static double day_minute(String v) {
        double str = Double.valueOf(v) * 24 * 60;
        return str;
    }

    public static double second_day(String v) {
        double str = Double.valueOf(v) / 60 / 60 / 24;
        return str;
    }

    public static double day_second(String v) {
        double str = Double.valueOf(v) * 24 * 60 * 60;
        return str;
    }


    public static String roundString(String str,int scale){
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal(str);
        return b.divide(a, scale, BigDecimal.ROUND_HALF_UP).toString();
    }
}
