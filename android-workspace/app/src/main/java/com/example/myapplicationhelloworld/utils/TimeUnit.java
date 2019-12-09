package com.example.myapplicationhelloworld.utils;

public class TimeUnit {
    private String num1 = "";
    private String unit1 = "";
    private String num2 = "";
    private String unit2 = "";

    public TimeUnit(){}

    public TimeUnit (String num1,String unit1,String unit2){
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

    public String TimeUniter () {
        String str = "";
        prepare();
        switch (getUnit1()) {
            case "y" :
                str = String.valueOf(TImeUnitTool.year_day(getNum1()));
                break;
            case "w" :
                str = String.valueOf(TImeUnitTool.week_day(getNum1()));
                break;
            case "d" :
                str = String.valueOf(TImeUnitTool.day_day(getNum1()));
                break;
            case "h" :
                str = String.valueOf(TImeUnitTool.hour_day(getNum1()));
                break;
            case "m" :
                str = String.valueOf(TImeUnitTool.minute_day(getNum1()));
                break;
            case "s" :
                str = String.valueOf(TImeUnitTool.second_day(getNum1()));
                break;
        }


        switch (getUnit2()) {
            case "y" :
                setNum2(String.valueOf(TImeUnitTool.day_year(str)));
                break;
            case "w" :
                setNum2(String.valueOf(TImeUnitTool.day_week(str)));
                break;
            case "d" :
                setNum2(String.valueOf(TImeUnitTool.day_day(str)));
                break;
            case "h" :
                setNum2(String.valueOf(TImeUnitTool.day_hour(str)));
                break;
            case "m" :
                setNum2(String.valueOf(TImeUnitTool.day_minute(str)));
                break;
            case "s" :
                setNum2(String.valueOf(TImeUnitTool.day_second(str)));
                break;
        }
        return getNum2();
    }

    public void prepare() {
        setUnit1(getUnit1().replace("年","y"));
        setUnit1(getUnit1().replace("周","w"));
        setUnit1(getUnit1().replace("天","d"));
        setUnit1(getUnit1().replace("小时","h"));
        setUnit1(getUnit1().replace("分钟","m"));
        setUnit1(getUnit1().replace("秒","s"));

        setUnit2(getUnit2().replace("年","y"));
        setUnit2(getUnit2().replace("周","w"));
        setUnit2(getUnit2().replace("天","d"));
        setUnit2(getUnit2().replace("小时","h"));
        setUnit2(getUnit2().replace("分钟","m"));
        setUnit2(getUnit2().replace("秒","s"));
    }

}
