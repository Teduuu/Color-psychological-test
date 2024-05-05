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

public class RActivity extends AppCompatActivity {

    private Button btn_back1;
    private TextView tv_random;
    private TextView tv_title;
    private RelativeLayout lo_random;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r);

        btn_back1 = findViewById(R.id.btn_back1);
        tv_random = findViewById(R.id.tv_random);
        tv_title = findViewById(R.id.tv_rantitle);
        lo_random = findViewById(R.id.lo_random);

        final String[] color = getResources().getStringArray(R.array.colors);
        final String[] mean = getResources().getStringArray(R.array.means);
        final String[] people = getResources().getStringArray(R.array.english);
        Bundle bd_random = getIntent().getExtras();
        int a = bd_random.getInt("random") ;
        tv_title.setText(color[a]+"："+people[a]);
        tv_random.setText("特質："+mean[a]);

        if(a==0){
            final Drawable drawable = getDrawable(R.drawable.red);
            lo_random.setBackground(drawable);
        }
        else if(a==1){
            final Drawable drawable = getDrawable(R.drawable.darkred);
            lo_random.setBackground(drawable);
        }
        else if(a==2){
            final Drawable drawable = getDrawable(R.drawable.pink);
            lo_random.setBackground(drawable);
        }
        else if(a==3){
            final Drawable drawable = getDrawable(R.drawable.orange);
            lo_random.setBackground(drawable);
        }
        else if(a==4){
            final Drawable drawable = getDrawable(R.drawable.lightyellow);
            lo_random.setBackground(drawable);
        }
        else if(a==5){
            final Drawable drawable = getDrawable(R.drawable.yellow);
            lo_random.setBackground(drawable);
        }
        else if(a==6){
            final Drawable drawable = getDrawable(R.drawable.lightgreen);
            lo_random.setBackground(drawable);
        }
        else if(a==7){
            final Drawable drawable = getDrawable(R.drawable.green);
            lo_random.setBackground(drawable);
        }
        else if(a==8){
            final Drawable drawable = getDrawable(R.drawable.lightblue);
            lo_random.setBackground(drawable);
        }
        else if(a==9){
            final Drawable drawable = getDrawable(R.drawable.blue);
            lo_random.setBackground(drawable);
        }
        else if(a==10){
            final Drawable drawable = getDrawable(R.drawable.purple);
            lo_random.setBackground(drawable);
        }
        else if(a==11){
            final Drawable drawable = getDrawable(R.drawable.black);
            lo_random.setBackground(drawable);
        }
        else if(a==12){
            final Drawable drawable = getDrawable(R.drawable.gray);
            lo_random.setBackground(drawable);
        }
        else {
            final Drawable drawable = getDrawable(R.drawable.white);
            lo_random.setBackground(drawable);
        }


        btn_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }
}
