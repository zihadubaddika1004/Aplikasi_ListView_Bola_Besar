package com.example.bolabesar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
        private String[] dataName;
        private String[] dataDescription;
        private TypedArray dataPhoto;
        private ball_adapter adapter;
        private ArrayList<Ball> balls;
        //Data-Data yang Akan dimasukan Pada ListView
        private String[] mahasiswa = {"SepakBola","BolaBasket","BolaVoli","Rugby","Futsal","SepakTakraw"};
        //ArrayList digunakan Untuk menampung Data mahasiswa
        private ArrayList<String> data;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            adapter = new ball_adapter(this);
            ListView listView = findViewById(R.id.lv_list);
            data = new ArrayList<>();
            getData();
            listView.setAdapter(adapter);
            prepare();
            addItem();
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String getName = data.get(i);

                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(MainActivity.this, DataBola.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            Toast.makeText(MainActivity.this, balls.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void addItem() {
        balls = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++){
            Ball ball = new Ball();
            ball.setPhoto(dataPhoto.getResourceId(i, -1));
            ball.setName(dataName[i]);
            ball.setDescription(dataDescription[i]);
            balls.add(ball);
            }
        adapter.setBalls(balls);
        }
    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
        }
    private void getData(){
        //Memasukan Semua Data mahasiswa kedalam ArrayList
        Collections.addAll(data, mahasiswa);
    }
    }