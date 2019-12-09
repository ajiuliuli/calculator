package com.example.myapplicationhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplicationhelloworld.utils.WeightUnit;

public class WeightUnitActivity extends AppCompatActivity {

    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btn_0;
    Button btn_point;
    EditText input_num;
    EditText input_unit;
    EditText output_num;
    EditText output_unit;
    Button btn_clear;
    Button btn_del;
    Button btn_gram;
    Button btn_jin;
    Button btn_kilogram;
    Button btn_tonne;
    Button btn_ounce;
    Button btn_pound;
    Button btn_swap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_unit);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_0 = (Button) findViewById(R.id.btn_0);
        input_num = (EditText) findViewById(R.id.input_num);
        input_unit = (EditText) findViewById(R.id.input_unit);
        output_num = (EditText) findViewById(R.id.output_num);
        output_unit = (EditText) findViewById(R.id.output_unit);
        btn_point = (Button) findViewById(R.id.btn_point);
        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_gram = (Button) findViewById(R.id.btn_gram);
        btn_jin = (Button) findViewById(R.id.btn_jin);
        btn_kilogram = (Button) findViewById(R.id.btn_kilogram);
        btn_tonne = (Button) findViewById(R.id.btn_tonne);
        btn_ounce = (Button) findViewById(R.id.btn_ounce);
        btn_pound = (Button) findViewById(R.id.btn_pound);
        btn_swap = (Button) findViewById(R.id.btn_swap);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append("0");
            }
        });

        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.append(".");
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_num.setText("");
                input_unit.setText("");
                output_num.setText("");
                output_unit.setText("");
            }
        });

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String str = input_num.getText().toString();
                    String substring = str.substring(0, str.length() - 1);
                    input_num.setText(substring);
                } catch (Exception e) {}
            }
        });

        btn_gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_unit.setText("克");
            }
        });

        btn_gram.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                output_unit.setText("克");
                return true;
            }
        });

        btn_jin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_unit.setText("斤");
            }
        });

        btn_jin.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                output_unit.setText("斤");
                return true;
            }
        });

        btn_kilogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_unit.setText("千克");
            }
        });

        btn_kilogram.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                output_unit.setText("千克");
                return true;
            }
        });

        btn_tonne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_unit.setText("公吨");
            }
        });

        btn_tonne.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                output_unit.setText("公吨");
                return true;
            }
        });

        btn_ounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_unit.setText("盎司");
            }
        });

        btn_ounce.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                output_unit.setText("盎司");
                return true;
            }
        });

        btn_pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_unit.setText("磅");
            }
        });

        btn_pound.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                output_unit.setText("磅");
                return true;
            }
        });

        btn_swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    WeightUnit str = new WeightUnit(input_num.getText().toString(),input_unit.getText().toString(),output_unit.getText().toString());
                    String result = str.WeightUniter();
                    output_num.setText(result);
                } catch (Exception e) {
                    Toast.makeText(WeightUnitActivity.this,"请参考使用说明正确输入！", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_weight_unit,menu);//getMenuInflater()方法得到MenuInflater
        //调用inflate接收两个参数
        //R.menu.main指调用menu文件下的main资源文件
        return true;//返回true，允许创建的菜单显示,返回false不显示
    }
    //定义菜单响应事件

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){   //item.getItemId()判断我们选择那个菜单项
            case R.id.back:
                finish();
                Toast.makeText(WeightUnitActivity.this,"您已返回计算器界面",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
