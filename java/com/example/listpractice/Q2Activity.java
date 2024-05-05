package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q2Activity extends AppCompatActivity {

    Button q2_1,q2_2,q2_3,q2_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        Bundle bundle = getIntent().getExtras();
        final int index1 = bundle.getInt("index1");

        q2_1 = findViewById(R.id.btn_q2_1);
        q2_2 = findViewById(R.id.btn_q2_2);
        q2_3 = findViewById(R.id.btn_q2_3);
        q2_4 = findViewById(R.id.btn_q2_4);

        q2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq2 = new Intent(Q2Activity.this,Q3Activity.class);
                final Bundle bundleq2 = new Bundle();
                bundleq2.putInt("index1",index1);
                bundleq2.putInt("index2",4);
                intentq2.putExtras(bundleq2);
                startActivity(intentq2);
            }
        });
        q2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq2 = new Intent(Q2Activity.this,Q3Activity.class);
                final Bundle bundleq2 = new Bundle();
                bundleq2.putInt("index1",index1);
                bundleq2.putInt("index2",2);
                intentq2.putExtras(bundleq2);
                startActivity(intentq2);
            }
        });
        q2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq2 = new Intent(Q2Activity.this,Q3Activity.class);
                final Bundle bundleq2 = new Bundle();
                bundleq2.putInt("index1",index1);
                bundleq2.putInt("index2",9);
                intentq2.putExtras(bundleq2);
                startActivity(intentq2);
            }
        });
        q2_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq2 = new Intent(Q2Activity.this,Q3Activity.class);
                final Bundle bundleq2 = new Bundle();
                bundleq2.putInt("index1",index1);
                bundleq2.putInt("index2",10);
                intentq2.putExtras(bundleq2);
                startActivity(intentq2);
            }
        });

    }
}
