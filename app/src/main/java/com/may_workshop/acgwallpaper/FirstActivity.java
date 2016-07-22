package com.may_workshop.acgwallpaper;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class FirstActivity extends AppCompatActivity {

    private Button start,about;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    /*开始按钮活动*/
        start=(Button) findViewById(R.id.button);
        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                //内部类监听
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });

        about=(Button)findViewById(R.id.button2);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //内部类监听
                Intent intent2=new Intent();
                intent2.setAction("android.intent.action.VIEW");
                Uri url=Uri.parse("http://may-workshop.com");
                intent2.setData(url);
                startActivity(intent2);
            }
        });



    }
}
