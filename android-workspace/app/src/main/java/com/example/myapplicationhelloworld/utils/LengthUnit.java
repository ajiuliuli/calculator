package com.example.myapplicationhelloworld.utils;

public class LengthUnit {
    private String num1 = "";
    private String unit1 = "";
    private String num2 = "";
    private String unit2 = "";

    public LengthUnit(){}

    public LengthUnit (String num1,String unit1,String unit2){
        this.num1 = num1;
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }



    public String LengthUniter () {
        String str = "";
        prepare();
        switch (getUnit1()) {
            case "m" :
                str = String.valueOf(LengthUnitTool.millimeter_meter(getNum1()));
                break;
            case "c" :
                str = String.valueOf(LengthUnitTool.centimeter_meter(getNum1()));
                break;
            case "r" :
                str = String.valueOf(LengthUnitTool.meter_meter(getNum1()));
                break;
            case "k" :
                str = String.valueOf(LengthUnitTool.kilometer_meter(getNum1()));
                break;
            case "i" :
                str = String.valueOf(LengthUnitTool.inch_meter(getNum1()));
                break;
            case "f" :
                str = String.valueOf(LengthUnitTool.feet_meter(getNum1()));
                break;
        }


        switch (getUnit2()) {
            case "m" :
                setNum2(String.valueOf(LengthUnitTool.meter_millimeter(str)));
                break;
            case "c" :
                setNum2(String.valueOf(LengthUnitTool.meter_centimeter(str)));
                break;
            case "r" :
                setNum2(String.valueOf(LengthUnitTool.meter_meter(str)));
                break;
            case "k" :
                setNum2(String.valueOf(LengthUnitTool.meter_kilometer(str)));
                break;
            case "i" :
                setNum2(String.valueOf(LengthUnitTool.meter_inch(str)));
                break;
            case "f" :
                setNum2(String.valueOf(LengthUnitTool.meter_feet(str)));
                break;
        }
        return getNum2();
    }

    public void prepare() {
        setUnit1(getUnit1().replace("毫米","m"));
        setUnit1(getUnit1().replace("厘米","c"));
        setUnit1(getUnit1().replace("米","r"));
        setUnit1(getUnit1().replace("公里","k"));
        setUnit1(getUnit1().replace("英寸","i"));
        setUnit1(getUnit1().replace("英尺","f"));

        setUnit2(getUnit2().replace("毫米","m"));
        setUnit2(getUnit2().replace("厘米","c"));
        setUnit2(getUnit2().replace("米","r"));
        setUnit2(getUnit2().replace("公里","k"));
        setUnit2(getUnit2().replace("英寸","i"));
        setUnit2(getUnit2().replace("英尺","f"));
    }
}
