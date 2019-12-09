package com.example.myapplicationhelloworld.utils;

public class WeightUnit {
    private String num1 = "";
    private String unit1 = "";
    private String num2 = "";
    private String unit2 = "";

    public WeightUnit(){}

    public WeightUnit (String num1,String unit1,String unit2){
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
            case "g" :
                str = String.valueOf(WeightUnitTool.gram_kilogram(getNum1()));
                break;
            case "j" :
                str = String.valueOf(WeightUnitTool.jin_kilogram(getNum1()));
                break;
            case "k" :
                str = String.valueOf(WeightUnitTool.kilogram_kilogram(getNum1()));
                break;
            case "t" :
                str = String.valueOf(WeightUnitTool.tonne_kilogram(getNum1()));
                break;
            case "o" :
                str = String.valueOf(WeightUnitTool.ounce_kilogram(getNum1()));
                break;
            case "p" :
                str = String.valueOf(WeightUnitTool.pound_kilogram(getNum1()));
                break;
        }


        switch (getUnit2()) {
            case "g" :
                setNum2(String.valueOf(WeightUnitTool.kilogram_gram(str)));
                break;
            case "j" :
                setNum2(String.valueOf(WeightUnitTool.kilogram_jin(str)));
                break;
            case "k" :
                setNum2(String.valueOf(WeightUnitTool.kilogram_kilogram(str)));
                break;
            case "t" :
                setNum2(String.valueOf(WeightUnitTool.kilogram_tonne(str)));
                break;
            case "o" :
                setNum2(String.valueOf(WeightUnitTool.kilogram_ounce(str)));
                break;
            case "p" :
                setNum2(String.valueOf(WeightUnitTool.kilogram_pound(str)));
                break;
        }
        return getNum2();
    }

    public void prepare() {
        setUnit1(getUnit1().replace("克","g"));
        setUnit1(getUnit1().replace("斤","j"));
        setUnit1(getUnit1().replace("千g","k"));
        setUnit1(getUnit1().replace("公吨","t"));
        setUnit1(getUnit1().replace("盎司","o"));
        setUnit1(getUnit1().replace("磅","p"));

        setUnit2(getUnit2().replace("克","g"));
        setUnit2(getUnit2().replace("斤","j"));
        setUnit2(getUnit2().replace("千g","k"));
        setUnit2(getUnit2().replace("公吨","t"));
        setUnit2(getUnit2().replace("盎司","o"));
        setUnit2(getUnit2().replace("磅","p"));
    }


}
