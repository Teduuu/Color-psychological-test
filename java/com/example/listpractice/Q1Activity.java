package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q1Activity extends AppCompatActivity {

    Button q1_1,q1_2,q1_3,q1_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        q1_1 = findViewById(R.id.btn_q1_1);
        q1_2 = findViewById(R.id.btn_q1_2);
        q1_3 = findViewById(R.id.btn_q1_3);
        q1_4 = findViewById(R.id.btn_q1_4);

        q1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq1 = new Intent(Q1Activity.this,Q2Activity.class);
                final Bundle bundle2 = new Bundle();
                bundle2.putInt("index1",0);
                intentq1.putExtras(bundle2);
                startActivity(intentq1);
            }
        });

        q1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq1 = new Intent(Q1Activity.this,Q2Activity.class);
                final Bundle bundle2 = new Bundle();
                bundle2.putInt("index1",3);
                intentq1.putExtras(bundle2);
                startActivity(intentq1);
            }
        });

        q1_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq1 = new Intent(Q1Activity.this,Q2Activity.class);
                final Bundle bundle2 = new Bundle();
                bundle2.putInt("index1",8);
                intentq1.putExtras(bundle2);
                startActivity(intentq1);
            }
        });

        q1_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq1 = new Intent(Q1Activity.this,Q2Activity.class);
                final Bundle bundle2 = new Bundle();
                bundle2.putInt("index1",7);
                intentq1.putExtras(bundle2);
                startActivity(intentq1);
            }
        });





    }
}
