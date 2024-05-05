package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BActivity extends AppCompatActivity {

    private Button btn_back;
    private TextView tv_mean;
    private TextView tv_title;
    private RelativeLayout lo_choose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        lo_choose = findViewById(R.id.lo_choose);

        tv_mean = findViewById(R.id.tv_mean);
        tv_title = findViewById(R.id.tv_title);
        final String[] color = getResources().getStringArray(R.array.colors);
        final String[] mean = getResources().getStringArray(R.array.means);
        final String[] people = getResources().getStringArray(R.array.english);
        Bundle bd_choose = getIntent().getExtras();
        int index = bd_choose.getInt("index");
        tv_title.setText(color[index]+"："+people[index]);
        tv_mean.setText("特質："+mean[index]);
        if(index==0){
            final Drawable drawable = getDrawable(R.drawable.red);
            lo_choose.setBackground(drawable);
        }
        else if(index==1){
            final Drawable drawable = getDrawable(R.drawable.darkred);
            lo_choose.setBackground(drawable);
        }
        else if(index==2){
            final Drawable drawable = getDrawable(R.drawable.pink);
            lo_choose.setBackground(drawable);
        }
        else if(index==3){
            final Drawable drawable = getDrawable(R.drawable.orange);
            lo_choose.setBackground(drawable);
        }
        else if(index==4){
            final Drawable drawable = getDrawable(R.drawable.lightyellow);
            lo_choose.setBackground(drawable);
        }
        else if(index==5){
            final Drawable drawable = getDrawable(R.drawable.yellow);
            lo_choose.setBackground(drawable);
        }
        else if(index==6){
            final Drawable drawable = getDrawable(R.drawable.lightgreen);
            lo_choose.setBackground(drawable);
        }
        else if(index==7){
            final Drawable drawable = getDrawable(R.drawable.green);
            lo_choose.setBackground(drawable);
        }
        else if(index==8){
            final Drawable drawable = getDrawable(R.drawable.lightblue);
            lo_choose.setBackground(drawable);
        }
        else if(index==9){
            final Drawable drawable = getDrawable(R.drawable.blue);
            lo_choose.setBackground(drawable);
        }
        else if(index==10){
            final Drawable drawable = getDrawable(R.drawable.purple);
            lo_choose.setBackground(drawable);
        }
        else if(index==11){
            final Drawable drawable = getDrawable(R.drawable.black);
            lo_choose.setBackground(drawable);
        }
        else if(index==12){
            final Drawable drawable = getDrawable(R.drawable.gray);
            lo_choose.setBackground(drawable);
        }
        else if(index==13){
            final Drawable drawable = getDrawable(R.drawable.white);
            lo_choose.setBackground(drawable);
        }

    }
}
