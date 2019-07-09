package com.example.qqphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView[] image=new ImageView[12];//创建12个ImageView
    private int[] imagePath=new int[]{
            R.mipmap.img01,R.mipmap.img02,R.mipmap.img03,R.mipmap.img04,
            R.mipmap.img05,R.mipmap.img06,R.mipmap.img07,R.mipmap.img08,
            R.mipmap.img09,R.mipmap.img10,R.mipmap.img11,R.mipmap.img12
    };//保存ImageView的路径
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout gridLayout=(GridLayout)findViewById(R.id.layout);//获取网格布局对象
        for (int i=0;i<imagePath.length;i++){
            image[i]=new ImageView(MainActivity.this);//创建新的组件
            image[i].setImageResource(imagePath[i]);//为组件指定路径
            image[i].setPadding(2,2,2,2);//为组件设置边距
            ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(85,68);//设置宽高
            image[i].setLayoutParams(params);//为组件设置参数
            gridLayout.addView(image[i]);//将组件添加到布局管理器
        }
    }
}
