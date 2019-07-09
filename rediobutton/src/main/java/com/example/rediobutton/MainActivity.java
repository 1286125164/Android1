package com.example.rediobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup group=(RadioGroup)findViewById(R.id.radiogroup1);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton=(RadioButton)findViewById(i);
                Toast.makeText(getApplicationContext(),"按钮值发生了改变你选择了"+radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
