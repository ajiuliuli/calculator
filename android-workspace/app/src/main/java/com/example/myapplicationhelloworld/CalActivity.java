package com.example.myapplicationhelloworld;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplicationhelloworld.utils.Calculator;

/**
 * 计算器类
 */

public class CalActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    EditText input;
    EditText output;
    Button btn_plus;
    Button btn_minus;
    Button btn_divide;
    Button btn_multply;
    Button btn_point;
    Button btn_equal;
    Button btn_clear;
    Button btn_del;
    Button btn_sin;
    Button btn_cos;
    Button btn_leftBracket;
    Button btn_rightBracket;
    Button btn_tan;
    Button btn_sqrt;
    Button btn_square;
    Button btn_cube;
    Button btn_bin;
    Button btn_oct;
    Button btn_hex;
    Button btn_power;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载xml资源
//        setContentView(R.layout.activity_calculator);
        setContentView(R.layout.activity_calculator);


        //根据id获取view对象
        input = (EditText) findViewById(R.id.input);
        output = (EditText) findViewById(R.id.output);
        button0 = (Button) findViewById(R.id.btn_0);
        button1 = (Button) findViewById(R.id.btn_1);
        button2 = (Button) findViewById(R.id.btn_2);
        button3 = (Button) findViewById(R.id.btn_3);
        button4 = (Button) findViewById(R.id.btn_4);
        button5 = (Button) findViewById(R.id.btn_5);
        button6 = (Button) findViewById(R.id.btn_6);
        button7 = (Button) findViewById(R.id.btn_7);
        button8 = (Button) findViewById(R.id.btn_8);
        button9 = (Button) findViewById(R.id.btn_9);
        btn_plus = (Button) findViewById(R.id.btn_plus);
        btn_minus = (Button) findViewById(R.id.btn_minus);
        btn_multply = (Button) findViewById(R.id.btn_multply);
        btn_divide = (Button) findViewById(R.id.btn_divide);
        btn_point = (Button)findViewById(R.id.btn_point);
        btn_equal = (Button)findViewById(R.id.btn_equal);
        btn_clear = (Button)findViewById(R.id.btn_clear);
        btn_del = (Button)findViewById(R.id.btn_del);
        btn_sin = (Button)findViewById(R.id.btn_sin);
        btn_cos = (Button)findViewById(R.id.btn_cos);
        btn_leftBracket = (Button)findViewById(R.id.btn_leftBracket);
        btn_rightBracket = (Button)findViewById(R.id.btn_rightBracket);
        btn_tan = (Button)findViewById(R.id.btn_tan);
        btn_sqrt = (Button)findViewById(R.id.btn_sqrt);
        btn_square = (Button)findViewById(R.id.btn_square);
        btn_cube = (Button)findViewById(R.id.btn_cube);
        btn_bin = (Button)findViewById(R.id.btn_bin);
        btn_oct = (Button)findViewById(R.id.btn_oct);
        btn_hex = (Button)findViewById(R.id.btn_hex);
        btn_power = (Button)findViewById(R.id.power);
        //设置欢迎信息

        //绑定单击事件
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("9");
            }
        });
        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(".");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("+");
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("-");
            }
        });
        btn_multply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("*");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("/");
            }
        });
        btn_sin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                try {
//                    Double str = Double.valueOf(input.getText().toString());
//                    double a = 0;
//                    a = Math.round(Math.sin(str*Math.PI/180)*100);
//                    input.setText("sin" + input.getText().toString() + "°");
//                    output.setText(a/100+"");
//                } catch (Exception e) {
//                    output.setText("结果未定义！");
//                }
//            }
                @Override
                public void onClick(View view) {
                    input.append("sin");
                }
        });
        btn_cos.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                try {
//                    Double str = Double.valueOf(input.getText().toString());
//                    double a = Math.round(Math.cos(str*Math.PI/180)*100);
//                    input.setText("cos" + input.getText().toString() + "°");
//                    output.setText(a/100+"");
//                } catch (NumberFormatException e) {
//                    output.setText("操作未定义！");
//                }
//            }
            @Override
            public void onClick(View view) {
            input.append("cos");
            }
        });
        btn_leftBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("(");
            }
        });
        //左括号读入

        btn_rightBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append(")");
            }
        });
        //右括号读入

        btn_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("tan");
            }
        });
        //正切求值

        btn_sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("√");
            }
        });
        //开平方

        btn_square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("²");
            }
        });
        //平方

        btn_cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("³");
            }
        });
        //立方

        btn_bin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int str = Integer.valueOf(input.getText().toString());
                    output.setText(Integer.toBinaryString(str));
                } catch (NumberFormatException e) {
                    output.setText("操作未定义！");
                }
            }
        });
        //二进制转换

        btn_oct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int str = Integer.valueOf(input.getText().toString());
                    output.setText(Integer.toOctalString(str));
                } catch (NumberFormatException e) {
                    output.setText("操作未定义！");
                }
            }
        });
        //八进制转换

        btn_hex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int str = Integer.valueOf(input.getText().toString());
                    output.setText(Integer.toHexString(str));
                } catch (NumberFormatException e) {
                    output.setText("操作未定义！");
                }
            }
        });
        //十六进制转换

        btn_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.append("^");
            }
        });
        //^计算

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String exp = input.getText().toString();
                    input.setText(input.getText().toString());
                    String result = Calculator.conversion(exp);
                    output.setText(result + "");
            }
        });
        //等于号，输出结果

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                output.setText("");
                input.setText("");
            }
        });
        //清零

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String str = input.getText().toString();
                    String substring = str.substring(0, str.length() - 1);
                    input.setText(substring);
                } catch (Exception e) {}
            }
        });
        //回退
    }

    //用onCreateOptionsMenu（）显示菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_calculator,menu);//getMenuInflater()方法得到MenuInflater
        //调用inflate接收两个参数
        //R.menu.main指调用menu文件下的main资源文件
        return true;//返回true，允许创建的菜单显示,返回false不显示
    }
    //定义菜单响应事件

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){   //item.getItemId()判断我们选择那个菜单项
            case R.id.length:
                Intent intentLength = new Intent(CalActivity.this,LengthUnitActivity.class);
                startActivity(intentLength);
                Toast.makeText(this,"您已进入长度转换界面",Toast.LENGTH_SHORT).show();
                break;
            case R.id.weight:
                Intent intentWeight = new Intent(CalActivity.this,WeightUnitActivity.class);
                startActivity(intentWeight);
                Toast.makeText(this,"您已进入重量转换界面",Toast.LENGTH_SHORT).show();
                break;
            case R.id.time:
                Intent intentTime = new Intent(CalActivity.this, TimeUnitActivity.class);
                startActivity(intentTime);
                Toast.makeText(this,"您已进入时间转换界面！",Toast.LENGTH_SHORT).show();
                break;
            case R.id.volume:
                Intent intentVolume = new Intent(CalActivity.this,VolumeUnitActivity.class);
                startActivity(intentVolume);
                Toast.makeText(this,"您已进入长度转换界面",Toast.LENGTH_SHORT).show();
                break;
            case R.id.system:
                Toast.makeText(this, "您已进入进制转换界面！", Toast.LENGTH_SHORT).show();
                Intent intentSystem = new Intent(CalActivity.this,SystemUnitActivity.class);
                startActivity(intentSystem);
                break;
            case R.id.first:
                Toast.makeText(this, "您已进入帮助页面！", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CalActivity.this,HelpActivity.class);
                startActivity(intent);
                break;
            case R.id.second:{
                AlertDialog.Builder dialog = new AlertDialog.Builder(CalActivity.this);
                dialog.setTitle("退出警告！");
                dialog.setMessage("您确认退出吗？");
                dialog.setCancelable(false);
                dialog.setPositiveButton("确认！", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                    finish();
                    }
                });
                dialog.setNegativeButton("我再想想！", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                    }
                });
                dialog.show();
            }
                break;
            default:
        }
        return true;
    }
}


