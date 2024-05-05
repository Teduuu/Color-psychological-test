package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Q5Activity extends AppCompatActivity {

    Button q5_1,q5_2,q5_3,q5_4;
    TextView tv_q5_1,tv_q5_2,tv_q5_3,tv_q5_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);

        Bundle bundle = getIntent().getExtras();
        final int a = bundle.getInt("index1");
        final int b = bundle.getInt("index2");
        final int c = bundle.getInt("index3");
        final int d = bundle.getInt("index4");

        final String[] text = getResources().getStringArray(R.array.q5);

        q5_1 = findViewById(R.id.btn_q5_1);
        q5_2 = findViewById(R.id.btn_q5_2);
        q5_3 = findViewById(R.id.btn_q5_3);
        q5_4 = findViewById(R.id.btn_q5_4);

        tv_q5_1 = findViewById(R.id.tv_q5_1);
        tv_q5_2 = findViewById(R.id.tv_q5_2);
        tv_q5_3 = findViewById(R.id.tv_q5_3);
        tv_q5_4 = findViewById(R.id.tv_q5_4);

        tv_q5_1.setText(text[a]);
        tv_q5_2.setText(text[b]);
        tv_q5_3.setText(text[c]);
        tv_q5_4.setText(text[d]);

        q5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq5 = new Intent(Q5Activity.this,FActivity.class);
                final Bundle bundleq5 = new Bundle();
                bundleq5.putInt("index",a);
                intentq5.putExtras(bundleq5);
                startActivity(intentq5);
            }
        });

        q5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq5 = new Intent(Q5Activity.this,FActivity.class);
                final Bundle bundleq5 = new Bundle();
                bundleq5.putInt("index",b);
                intentq5.putExtras(bundleq5);
                startActivity(intentq5);
            }
        });

        q5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq5 = new Intent(Q5Activity.this,FActivity.class);
                final Bundle bundleq5 = new Bundle();
                bundleq5.putInt("index",c);
                intentq5.putExtras(bundleq5);
                startActivity(intentq5);
            }
        });

        q5_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentq5 = new Intent(Q5Activity.this,FActivity.class);
                final Bundle bundleq5 = new Bundle();
                bundleq5.putInt("index",d);
                intentq5.putExtras(bundleq5);
                startActivity(intentq5);
            }
        });




    }
}
