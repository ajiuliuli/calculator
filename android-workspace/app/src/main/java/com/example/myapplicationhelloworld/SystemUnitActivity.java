package com.example.myapplicationhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SystemUnitActivity extends AppCompatActivity {
    static char a[] =new char [36];
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
    Button btn_swap;

    static String transRadix(String num,int fromRadix, int toRadix) {
        for(int i = 0;i<10;i++) {
            a[i]=(char)('0'+i);
        }
        for(int i=10;i<a.length;i++) {
            a[i]=(char)('A'+(i-10));
        }
        int number=Integer.valueOf(num, fromRadix);
        StringBuilder s=new StringBuilder();
        while(number!=0) {
            if(toRadix==0)
                return null;
            s.append(a[number%toRadix]);
            number=number/toRadix;
        }
        return s.reverse().toString();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_unit);

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

        btn_swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = transRadix(input_num.getText().toString(),Integer.parseInt(input_unit.getText().toString()),Integer.parseInt(output_unit.getText().toString()));
                output_num.setText(str);
            }
        });
    }
}
