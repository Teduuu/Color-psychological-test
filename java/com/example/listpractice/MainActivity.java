package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_go,btn_go1;
    ListView list;
    int a=0;
    String[] list_title = new String[]{"紅色","深紅","粉色","橘色","淺黃","黃色","淺綠","綠色","淺藍",
            "藍色","紫色","黑色","灰色","白色"};
    String[] list_mean = new String[]{"將軍","浪人","公主","說書人","仕女","王子","見習生","長老",
            "裁縫師","偵探","女巫","僧侶","士兵","天使"};


    int[] icon = new int[]{R.drawable.redicon,R.drawable.darkredicon,R.drawable.pinkicon,
            R.drawable.orangeicon ,R.drawable.lightyellowicon,R.drawable.yellowicon,
            R.drawable.lightgreenicon,R.drawable.greenicon,R.drawable.lightblueicon,
            R.drawable.blueicon,R.drawable.purpleicon,R.drawable.blackicon,R.drawable.grayicon,R.drawable.whiteicon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        listlayoutadapter adasports=new listlayoutadapter(this);

        list.setAdapter(adasports);

        btn_go = findViewById(R.id.btn_go);
        btn_go1 = findViewById(R.id.btn_go1);




        //隨機按鈕
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,RActivity.class);
                Random x = new Random();
                a=x.nextInt(14);
                final Bundle bundle1 = new Bundle();
                bundle1.putInt("random",a);
                intent1.putExtras(bundle1);
                startActivity(intent1);
            }


        });

        btn_go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,Q1Activity.class);
                startActivity(intent2);
            }
        });

        //選取
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent2 = new Intent(MainActivity.this,BActivity.class);
                final Bundle bundle2 = new Bundle();
                bundle2.putInt("index",position);
                intent2.putExtras(bundle2);
                startActivity(intent2);
            }
        });

    }

    public class listlayoutadapter extends BaseAdapter {

        private LayoutInflater listlayoutInflater;

        public listlayoutadapter(Context c) {
            listlayoutInflater = LayoutInflater.from(c);
        }

        @Override
        public int getCount() {
            return list_title.length;
        }

        @Override
        public Object getItem(int position) {
            return list_title[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = listlayoutInflater.inflate(R.layout.listlayout, null);


            ImageView img_logo = convertView.findViewById(R.id.img_logo);
            TextView title = convertView.findViewById(R.id.title);
            TextView cotitle = convertView.findViewById(R.id.cotitle);

            img_logo.setImageResource(icon[position]);
            title.setText(list_title[position]);
            cotitle.setText(list_mean[position]);

            return convertView;
        }
    }



}
