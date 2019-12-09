package com.example.myapplicationhelloworld.utils;

import java.util.Collections;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 *  算数表达式求值
 *  直接调用Calculator的类方法conversion()
 *  传入算数表达式，将返回一个浮点值结果
 *  如果计算过程错误，将返回一个NaN
 */
public class Calculator {
    private Stack<String> postfixStack = new Stack<String>();// 后缀式栈
    private Stack<Character> opStack = new Stack<Character>();// 运算符栈

    public static String conversion(String expression) {

        Pattern pattern = Pattern.compile("s[-\\+]?[\\d]*$");
        //正则判断是否为单个数字
        double result = 0;
        if (pattern.matcher(expression).matches()) {
            result = Double.valueOf(expression);
            return String.valueOf(result);
        }
        else {
            Calculator cal = new Calculator();
            try {
                expression = transform(expression);
                result = cal.calculate(expression);
            } catch (Exception e) {
                // e.printStackTrace();
                // 运算错误返回NaN
                return "结果未定义！";
            }
            // return new String().valueOf(result);
            return String.valueOf(result);
        }
    }

    /**
     * 将表达式中负数的符号更改
     *
     * @param expression
     *            例如-2+-1*(-3E-2)-(-1) 被转为 ~2+~1*(~3E~2)-(~1)
     * @return
     */
    private static String transform(String expression) {
        char[] arr = expression.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '-') {
                if (i == 0) {
                    arr[i] = '~';
                } else {
                    char c = arr[i - 1];
                    if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == 'E' || c == 'e' || c == 's' || c == 'c' || c == 't' || c == '²' || c == '³') {
                        arr[i] = '~';
                    }
                }
            }
        }
        //System.out.println(arr);
        if(arr[0]=='~'||arr[1]=='('){
            arr[0]='-';
            return "0"+new String(arr);
            //若首位数字为负数
            //则将已经转换好的负数的符号变更为'0-**'
        }else{
            return new String(arr);
        }
    }
    /**
     * 为支持负数运算
     * 将用户可能输入的负数转化为计算机认识的语言
     */

    /**
     * 按照给定的表达式计算
     *
     * @param expression
     *            要计算的表达式例如:5+12*(3+5)/7
     * @return
     */
    public double calculate(String expression) {
        Stack<String> resultStack = new Stack<String>();
        prepare(expression);
        Collections.reverse(postfixStack);// 将后缀式栈反转
        String firstValue, secondValue, currentValue;// 参与计算的第一个值，第二个值和算术运算符
        while (!postfixStack.isEmpty()) {
            currentValue = postfixStack.pop();
            if (!isOperator(currentValue.charAt(0))) {// 如果不是运算符则存入操作数栈中
                currentValue = currentValue.replace("~", "-");
                resultStack.push(currentValue);
            } else {// 如果是运算符则从操作数栈中取两个值和该数值一起参与运算
                try {
                    secondValue = resultStack.pop();
                } catch (Exception e) {
                    secondValue = "";
                }
                try {
                    if (currentValue.charAt(0) == 's' || currentValue.charAt(0) == 'c' || currentValue.charAt(0) == 't') {
                        firstValue = "";
                    }
                    else
                        firstValue = resultStack.pop();
                } catch (Exception e) {
                    if(currentValue.charAt(0) != '-' && currentValue.charAt(0) != '+')
                        firstValue = "";
                    else
                        firstValue = "0";
                }

                //System.out.println(firstValue);
                System.out.println(secondValue);

                // 将负数标记符改为负号
                firstValue = firstValue.replace("~", "-");
                secondValue = secondValue.replace("~", "-");

                //System.out.println(firstValue);
                System.out.println(secondValue);
//                if (currentValue.charAt(0) == 's') {
//                    firstValue = "";
//                }
                if (currentValue.charAt(0) == '²' || currentValue.charAt(0) == '³')
                    resultStack.push(firstValue);
                String tempResult = calculate(firstValue, secondValue, currentValue.charAt(0));
                resultStack.push(tempResult);
            }
        }
        return Double.valueOf(resultStack.pop());
    }

    /**
     * 数据准备阶段将表达式转换成为后缀式栈
     *
     * @param expression
     */
    private void prepare(String expression) {
        expression = expression.replace("sin","s");
        expression = expression.replace("cos","c");
        expression = expression.replace("tan","t");
        opStack.push(',');// 运算符放入栈底元素逗号，此符号优先级最低
        char[] arr = expression.toCharArray();
        int currentIndex = 0;// 当前字符的位置
        int count = 0;// 上次算术运算符到本次算术运算符的字符的长度便于或者之间的数值
        char currentOp, peekOp;// 当前操作符和栈顶操作符
        for (int i = 0; i < arr.length; i++) {
            currentOp = arr[i];
            //System.out.println(currentOp);
            if (isOperator(currentOp)) {// 如果当前字符是运算符
                if (count > 0) {
                    //System.out.println(currentIndex);
                    postfixStack.push(new String(arr, currentIndex, count));// 取两个运算符之间的数字
                }
                peekOp = opStack.peek();
                //System.out.println("符号" + peekOp);
                //System.out.println("数字" + postfixStack.peek());
                if (currentOp == ')') {// 遇到反括号则将运算符栈中的元素移除到后缀式栈中直到遇到左括号
                    while (opStack.peek() != '(') {
                        postfixStack.push(String.valueOf(opStack.pop()));
                        //System.out.println("1");
                    }
                    opStack.pop();
                } else {
                    while (currentOp != '(' && peekOp != ',' && compare(currentOp, peekOp)) {
                        postfixStack.push(String.valueOf(opStack.pop()));
                        peekOp = opStack.peek();
                    }
                    opStack.push(currentOp);
                }
                count = 0;
                currentIndex = i + 1;
            } else {
                count++;
            }
        }
        if (count > 1 || (count == 1 && !isOperator(arr[currentIndex]))) {// 最后一个字符不是括号或者其他运算符的则加入后缀式栈中
            postfixStack.push(new String(arr, currentIndex, count));
            System.out.println("2");
        }

        while (opStack.peek() != ',') {
            postfixStack.push(String.valueOf(opStack.pop()));// 将操作符栈中的剩余的元素添加到后缀式栈中
            System.out.println("3");
        }
    }

    /**
     * 判断是否为算术符号
     *
     * @param c
     * @return
     */
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')' || c == '√' || c == 's' || c == 'c'  || c == 't'|| c == '²' || c == '³' || c == '^';
    }


    /**
     * 利用ASCII码-40做下标去算术符号优先级
     *
     * @param cur
     * @param peek
     * @return
     */
    public boolean compare(char cur, char peek) {// 如果是peek优先级高于cur，返回true，默认都是peek优先级要低
        boolean result = false;
        int a = 0;
        switch (cur) {
            case '+':
            case '-': a = 1;
                break;
            case '*':
            case '/': a = 2;
                break;
            case '(': a = 0;
                break;
            case ')': a = 4;
                break;
            case '²':
            case '³':
            case '^':
            case 's':
            case 'c':
            case 't':
            case '√': a = 3;
                break;
        }

        int b = 0;
        switch (peek) {
            case '+':
            case '-': b = 1;
                break;
            case '*':
            case '/': b = 2;
                break;
            case '(': b = 0;
                break;
            case ')': b = 4;
                break;
            case '²':
            case '³':
            case '^':
            case 's':
            case 'c':
            case 't':
            case '√': b = 3;
                break;
        }
        if (b >= a)
            result = true;
        return result;
    }

    /**
     * 按照给定的算术运算符做计算
     *
     * @param firstValue
     * @param secondValue
     * @param currentOp
     * @return
     */
    private String calculate(String firstValue, String secondValue, char currentOp) {
        String result = "";
        switch (currentOp) {
            case '+':
                result = String.valueOf(ArithHelper.add(firstValue, secondValue));
                break;
            case '-':
                result = String.valueOf(ArithHelper.sub(firstValue, secondValue));
                break;
            case '*':
                result = String.valueOf(ArithHelper.mul(firstValue, secondValue));
                break;
            case '/':
                result = String.valueOf(ArithHelper.div(firstValue, secondValue));
                break;
            case '√':
                result = String.valueOf(ArithHelper.sqrt(firstValue,secondValue));
                break;
            case 's':
                result = String.valueOf(ArithHelper.sin(secondValue));
                break;
            case 'c':
                result = String.valueOf(ArithHelper.cos(secondValue));
                break;
            case 't':
                result = String.valueOf(ArithHelper.tan(secondValue));
                break;
            case '²':
                result = String.valueOf(ArithHelper.square(secondValue));
                break;
            case '³':
                result = String.valueOf(ArithHelper.cube(secondValue));
                break;
            case '^':
                result = String.valueOf(ArithHelper.power(firstValue,secondValue));
                break;
        }
        return result;
    }
}