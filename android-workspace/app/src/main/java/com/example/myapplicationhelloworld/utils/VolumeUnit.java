package com.example.myapplicationhelloworld.utils;

public class VolumeUnit {
    private String num1 = "";
    private String unit1 = "";
    private String num2 = "";
    private String unit2 = "";

    public VolumeUnit(){}

    public VolumeUnit (String num1,String unit1,String unit2){
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



    public String WeightUniter () {
        String str = "";
        prepare();
        switch (getUnit1()) {
            case "a" :
                str = String.valueOf(VolumeUnitTool.ml_l(getNum1()));
                break;
            case "b" :
                str = String.valueOf(VolumeUnitTool.cm3_l(getNum1()));
                break;
            case "c" :
                str = String.valueOf(VolumeUnitTool.l_l(getNum1()));
                break;
            case "d" :
                str = String.valueOf(VolumeUnitTool.m3_l(getNum1()));
                break;
            case "e" :
                str = String.valueOf(VolumeUnitTool.dm3_l(getNum1()));
                break;
            case "f" :
                str = String.valueOf(VolumeUnitTool.dl_l(getNum1()));
                break;
        }


        switch (getUnit2()) {
            case "a" :
                setNum2(String.valueOf(VolumeUnitTool.l_ml(str)));
                break;
            case "b" :
                setNum2(String.valueOf(VolumeUnitTool.l_cm3(str)));
                break;
            case "c" :
                setNum2(String.valueOf(VolumeUnitTool.l_l(str)));
                break;
            case "d" :
                setNum2(String.valueOf(VolumeUnitTool.l_m3(str)));
                break;
            case "e" :
                setNum2(String.valueOf(VolumeUnitTool.l_dm3(str)));
                break;
            case "f" :
                setNum2(String.valueOf(VolumeUnitTool.l_dl(str)));
                break;
        }
        return getNum2();
    }

    public void prepare() {
        setUnit1(getUnit1().replace("毫升","a"));
        setUnit1(getUnit1().replace("立方厘米","b"));
        setUnit1(getUnit1().replace("升","c"));
        setUnit1(getUnit1().replace("立方米","d"));
        setUnit1(getUnit1().replace("立方分米","e"));
        setUnit1(getUnit1().replace("分c","f"));

        setUnit2(getUnit2().replace("毫升","a"));
        setUnit2(getUnit2().replace("立方厘米","b"));
        setUnit2(getUnit2().replace("升","c"));
        setUnit2(getUnit2().replace("立方米","d"));
        setUnit2(getUnit2().replace("立方分米","e"));
        setUnit2(getUnit2().replace("分c","f"));
    }

}
