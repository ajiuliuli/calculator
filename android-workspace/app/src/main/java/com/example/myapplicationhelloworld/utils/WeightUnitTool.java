package com.example.myapplicationhelloworld.utils;

import java.math.BigDecimal;

public class WeightUnitTool {
    public static double gram_kilogram (String v) {
        double str = Double.valueOf(v) / 1000;
        return str;
    }

    public static double kilogram_gram (String v) {
        double str = Double.valueOf(v) * 1000;
        return str;
    }

    public static double jin_kilogram (String v) {
        double str = Double.valueOf(v) * 0.5;
        return str;
    }

    public static double kilogram_jin (String v) {
        double str = Double.valueOf(v) / 0.5;
        return str;
    }

    public static double kilogram_kilogram (String v) {
        double str = Double.valueOf(v) * 1;
        return str;
    }

    public static double tonne_kilogram (String v) {
        double str = Double.valueOf(v) * 1000;
        return str;
    }

    public static double kilogram_tonne (String v) {
        double str = Double.valueOf(v) / 1000;
        return str;
    }

    public static double ounce_kilogram (String v) {
        double str = Double.valueOf(v) * 0.0283495;
        return str;
    }

    public static double kilogram_ounce (String v) {
        double str = Double.valueOf(v) / 0.0283495;
        return str;
    }

    public static double pound_kilogram (String v) {
        double str = Double.valueOf(v) * 0.453592;
        return str;
    }

    public static double kilogram_pound (String v) {
        double str = Double.valueOf(v) / 0.453592;
        return str;
    }


    public static String roundString(String str,int scale){
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal(str);
        return b.divide(a, scale, BigDecimal.ROUND_HALF_UP).toString();
    }
}
