package com.example.myapplicationhelloworld.utils;

public class LengthUnitTool {
    public static double millimeter_meter (String v) {
        double str = Double.valueOf(v) / 1000;
        return str;
    }

    public static double meter_millimeter (String v) {
        double str = Double.valueOf(v) * 1000;
        return str;
    }

    public static double centimeter_meter (String v) {
        double str = Double.valueOf(v) / 100;
        return str;
    }

    public static double meter_centimeter (String v) {
        double str = Double.valueOf(v) * 100;
        return str;
    }

    public static double meter_meter (String v) {
        double str = Double.valueOf(v);
        return str;
    }

    public static double kilometer_meter (String v) {
        double str = Double.valueOf(v) * 1000;
        return str;
    }

    public static double meter_kilometer (String v) {
        double str = Double.valueOf(v) / 1000;
        return str;
    }

    public static double inch_meter (String v) {
        double str = Double.valueOf(v) * 0.0254;
        return str;
    }

    public static double meter_inch (String v) {
        double str = Double.valueOf(v) / 0.0254;
        return str;
    }

    public static double feet_meter (String v) {
        double str = Double.valueOf(v) * 0.3048;
        return str;
    }

    public static double meter_feet (String v) {
        double str = Double.valueOf(v) / 0.3048;
        return str;
    }
}
