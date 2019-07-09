package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
    private static final String[] book=new String[]{
            "Android快速入门","Android从入门到放弃","Eclipse操作","Intel芯片","AMD芯片"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏显示
        //获取自动完成文本框组件
        AutoCompleteTextView autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.at);
        //创建数组配饰器
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,book);
        autoCompleteTextView.setAdapter(adapter);

    }
}
