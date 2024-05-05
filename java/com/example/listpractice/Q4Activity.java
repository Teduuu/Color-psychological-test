package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q4Activity extends AppCompatActivity {

    Button q4_1,q4_2,q4_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        q4_1 = findViewById(R.id.btn_q4_1);
        q4_2 = findViewById(R.id.btn_q4_2);
        q4_3 = findViewById(R.id.btn_q4_3);

        Bundle bundle = getIntent().getExtras();
       final int index1 = bundle.getInt("index1");
       final int index2 = bundle.getInt("index2");
       final int index3 = bundle.getInt("index3");

        q4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq4 = new Intent(Q4Activity.this,Q5Activity.class);
                final Bundle bundleq4 = new Bundle();
                bundleq4.putInt("index1",index1);
                bundleq4.putInt("index2",index2);
                bundleq4.putInt("index3",index3);
                bundleq4.putInt("index4",1);
                intentq4.putExtras(bundleq4);
                startActivity(intentq4);
            }
        });
        q4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq4 = new Intent(Q4Activity.this,Q5Activity.class);
                final Bundle bundleq4 = new Bundle();
                bundleq4.putInt("index1",index1);
                bundleq4.putInt("index2",index2);
                bundleq4.putInt("index3",index3);
                bundleq4.putInt("index4",12);
                intentq4.putExtras(bundleq4);
                startActivity(intentq4);
            }
        });
        q4_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq4 = new Intent(Q4Activity.this,Q5Activity.class);
                final Bundle bundleq4 = new Bundle();
                bundleq4.putInt("index1",index1);
                bundleq4.putInt("index2",index2);
                bundleq4.putInt("index3",index3);
                bundleq4.putInt("index4",13);
                intentq4.putExtras(bundleq4);
                startActivity(intentq4);
            }
        });









    }
}
