package com.example.myapplicationhelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_help,menu);//getMenuInflater()方法得到MenuInflater
        //调用inflate接收两个参数
        //R.menu.main指调用menu文件下的main资源文件
        return true;//返回true，允许创建的菜单显示,返回false不显示
    }
    //定义菜单响应事件

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){   //item.getItemId()判断我们选择那个菜单项
            case R.id.first:
               finish();
            break;
            default:
        }
        return true;
    }
}
