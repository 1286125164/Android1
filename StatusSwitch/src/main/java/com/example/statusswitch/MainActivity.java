package com.example.statusswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final Switch sw=(Switch)findViewById(R.id.sw);
        //设置开关状态改变监听器
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (sw.isChecked()){
                    Toast.makeText(MainActivity.this,"开启横屏模式",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"关闭横屏模式",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
