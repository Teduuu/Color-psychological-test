package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q3Activity extends AppCompatActivity {

    Button q3_1,q3_2,q3_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        q3_1 = findViewById(R.id.btn_q3_1);
        q3_2 = findViewById(R.id.btn_q3_2);
        q3_3 = findViewById(R.id.btn_q3_3);


        Bundle bundle = getIntent().getExtras();
        final int index1 = bundle.getInt("index1");
        final int index2 = bundle.getInt("index2");

        q3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq3 = new Intent(Q3Activity.this,Q4Activity.class);
                final Bundle bundleq3 = new Bundle();
                bundleq3.putInt("index1",index1);
                bundleq3.putInt("index2",index2);
                bundleq3.putInt("index3",11);
                intentq3.putExtras(bundleq3);
                startActivity(intentq3);
            }
        });
        q3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq3 = new Intent(Q3Activity.this,Q4Activity.class);
                final Bundle bundleq3 = new Bundle();
                bundleq3.putInt("index1",index1);
                bundleq3.putInt("index2",index2);
                bundleq3.putInt("index3",5);
                intentq3.putExtras(bundleq3);
                startActivity(intentq3);
            }
        });
        q3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq3 = new Intent(Q3Activity.this,Q4Activity.class);
                final Bundle bundleq3 = new Bundle();
                bundleq3.putInt("index1",index1);
                bundleq3.putInt("index2",index2);
                bundleq3.putInt("index3",6);
                intentq3.putExtras(bundleq3);
                startActivity(intentq3);
            }
        });


    }
}
