package com.example.myapplicationhelloworld.utils;

public class VolumeUnitTool {
    public static double ml_l (String v) {
        double str = Double.valueOf(v) / 1000;
        return str;
    }

    public static double l_ml (String v) {
        double str = Double.valueOf(v) * 1000;
        return str;
    }

    public static double cm3_l (String v) {
        double str = Double.valueOf(v) / 1000;
        return str;
    }

    public static double l_cm3 (String v) {
        double str = Double.valueOf(v) * 1000;
        return str;
    }

    public static double l_l (String v) {
        double str = Double.valueOf(v);
        return str;
    }

    public static double m3_l (String v) {
        double str = Double.valueOf(v) * 1000;
        return str;
    }

    public static double l_m3 (String v) {
        double str = Double.valueOf(v) /1000;
        return str;
    }

    public static double dl_l (String v) {
        double str = Double.valueOf(v) / 10;
        return str;
    }

    public static double l_dl (String v) {
        double str = Double.valueOf(v) * 10;
        return str;
    }

    public static double dm3_l (String v) {
        double str = Double.valueOf(v);
        return str;
    }

    public static double l_dm3 (String v) {
        double str = Double.valueOf(v);
        return str;
    }
}
