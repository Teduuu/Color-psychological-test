package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FActivity extends AppCompatActivity {

    private Button btn_back2;
    private TextView tv_mean2;
    private TextView tv_title2;
    private RelativeLayout lo_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f);

        Bundle bundle = getIntent().getExtras();
        final int index = bundle.getInt("index");


        btn_back2 = findViewById(R.id.btn_back2);
        btn_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        lo_final = findViewById(R.id.lo_final);

        tv_mean2 = findViewById(R.id.tv_mean2);
        tv_title2 = findViewById(R.id.tv_title2);
        final String[] color = getResources().getStringArray(R.array.colors);
        final String[] mean = getResources().getStringArray(R.array.means);
        final String[] people = getResources().getStringArray(R.array.english);

        tv_title2.setText(color[index]+"："+people[index]);
        tv_mean2.setText("特質："+mean[index]);
        if(index==0){
            final Drawable drawable = getDrawable(R.drawable.red);
            lo_final.setBackground(drawable);
        }
        else if(index==1){
            final Drawable drawable = getDrawable(R.drawable.darkred);
            lo_final.setBackground(drawable);
        }
        else if(index==2){
            final Drawable drawable = getDrawable(R.drawable.pink);
            lo_final.setBackground(drawable);
        }
        else if(index==3){
            final Drawable drawable = getDrawable(R.drawable.orange);
            lo_final.setBackground(drawable);
        }
        else if(index==4){
            final Drawable drawable = getDrawable(R.drawable.lightyellow);
            lo_final.setBackground(drawable);
        }
        else if(index==5){
            final Drawable drawable = getDrawable(R.drawable.yellow);
            lo_final.setBackground(drawable);
        }
        else if(index==6){
            final Drawable drawable = getDrawable(R.drawable.lightgreen);
            lo_final.setBackground(drawable);
        }
        else if(index==7){
            final Drawable drawable = getDrawable(R.drawable.green);
            lo_final.setBackground(drawable);
        }
        else if(index==8){
            final Drawable drawable = getDrawable(R.drawable.lightblue);
            lo_final.setBackground(drawable);
        }
        else if(index==9){
            final Drawable drawable = getDrawable(R.drawable.blue);
            lo_final.setBackground(drawable);
        }
        else if(index==10){
            final Drawable drawable = getDrawable(R.drawable.purple);
            lo_final.setBackground(drawable);
        }
        else if(index==11){
            final Drawable drawable = getDrawable(R.drawable.black);
            lo_final.setBackground(drawable);
        }
        else if(index==12){
            final Drawable drawable = getDrawable(R.drawable.gray);
            lo_final.setBackground(drawable);
        }
        else if(index==13){
            final Drawable drawable = getDrawable(R.drawable.white);
            lo_final.setBackground(drawable);
        }

    }
}
