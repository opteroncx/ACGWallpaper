package com.may_workshop.acgwallpaper;


import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class SecondActivity extends AppCompatActivity {
    private Button set,next,priv;
    private ImageView img;
    private int num=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    //设置壁纸
        set=(Button) findViewById(R.id.button4);
        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //内部类监听
                Resources res=getResources();
                BitmapDrawable bmpDraw;
                bmpDraw=(BitmapDrawable)res.getDrawable(R.drawable.a1);

                //图片标号
                switch (num){
                    case 1:bmpDraw=(BitmapDrawable)res.getDrawable(R.drawable.a1);break;
                    case 2:bmpDraw=(BitmapDrawable)res.getDrawable(R.drawable.a2);break;
                    case 3:bmpDraw=(BitmapDrawable)res.getDrawable(R.drawable.a3);break;
                    case 4:bmpDraw=(BitmapDrawable)res.getDrawable(R.drawable.a4);break;
                    case 5:bmpDraw=(BitmapDrawable)res.getDrawable(R.drawable.a5);break;

                }

                Bitmap bmp;
                bmp=bmpDraw.getBitmap();
                try {
                    setWallpaper(bmp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(SecondActivity.this, "设置成功", Toast.LENGTH_SHORT).show();


            }
        });
        img = (ImageView) findViewById(R.id.imageView);
        next=(Button) findViewById(R.id.button5);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //下一张图
                ++num;
                label:switch (num){
                        case 1:img.setBackgroundResource(R.drawable.a1);break;
                        case 2:img.setBackgroundResource(R.drawable.a2);break;
                        case 3:img.setBackgroundResource(R.drawable.a3);break;
                        case 4:img.setBackgroundResource(R.drawable.a4);break;
                        case 5:img.setBackgroundResource(R.drawable.a5);break;
                        default:num=1;break label;//循环回第一张
                }

            }
        });
        priv=(Button) findViewById(R.id.button3);
        priv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //上一张图
                --num;
                label:switch (num){
                        case 1:img.setBackgroundResource(R.drawable.a1);break;
                        case 2:img.setBackgroundResource(R.drawable.a2);break;
                        case 3:img.setBackgroundResource(R.drawable.a3);break;
                        case 4:img.setBackgroundResource(R.drawable.a4);break;
                        case 5:img.setBackgroundResource(R.drawable.a5);break;
                        default:num=5;break label;//循环回最后一张
                }

            }
        });
    }
}
