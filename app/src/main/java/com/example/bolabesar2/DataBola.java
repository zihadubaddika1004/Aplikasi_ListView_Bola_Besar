package com.example.bolabesar2;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class DataBola extends AppCompatActivity {

    //Deklarasi Variable
    private TextView GetText;
    private ImageView GetIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_bola);
        getSupportActionBar().setTitle("Data Bola");
        GetIcon= findViewById(R.id.getIcon);
        GetText = findViewById(R.id.getText);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData(){
        //Mendapatkan Nama Mahasiswa dari Activity sebelumnya
        String nama = getIntent().getExtras().getString("MyName");

        //Menentukan identitas yang ditampilkan bedasarkan nama yang dipilih
        switch (nama){
            case "SepakBola":
                GetIcon.setImageResource(R.drawable.bolakaki);
                GetText.setText("Sepak bola (bahasa Inggris: Football atau Soccer) adalah cabang olahraga yang menggunakan bola yang umumnya terbuat dari bahan kulit dan dimainkan oleh dua tim yang masing-masing beranggotakan 11(sebelas) orang pemain inti dan beberapa pemain cadangan. Memasuki abad ke-21, olahraga ini telah dimainkan oleh lebih dari 250 juta orang di 200 negara, yang menjadikannya olahraga paling populer di dunia. Sepak bola bertujuan untuk mencetak gol sebanyak-banyaknya dengan memasukan bola ke gawang lawan. Sepak bola dimainkan dalam lapangan terbuka yang berbentuk persegi panjang, di atas rumput atau rumput sintetis.");
                break;

            case "BolaBasket":
                GetIcon.setImageResource(R.drawable.bolabasket);
                GetText.setText("Telah dimainkan oleh lebih dari 250 juta orang di 200 negara, yang menjadikannya olahraga paling populer di dunia. Sepak bola bertujuan untuk mencetak gol sebanyak-banyaknya dengan memasukan bola ke gawang lawan. Sepak bola dimainkan dalam lapangan terbuka yang berbentuk persegi panjang, di atas rumput atau rumput sintetis.");
                break;

            case "BolaVoli":
                GetIcon.setImageResource(R.drawable.bolavoli);
                GetText.setText("Bola voli (bahasa Inggris: volleyball) adalah permainan olahraga yang dimainkan oleh dua grup berlawanan.Masing-masing grup memiliki enam orang pemain. Terdapat pula variasi permainan bola voli pantai yang masing-masing grup hanya memiliki dua orang pemain. Olahraga Bola Voli dinaungi FIVB (Federation Internationale de Volleyball) sebagai induk organisasi internasional, sedangkan di Indonesia, olahraga bola Voli dinaungi oleh PBVSI (Persatuan Bola Voli Seluruh Indonesia.");
                break;

            case "Rugby":
                GetIcon.setImageResource(R.drawable.rugby);
                GetText.setText("Sepak bola rugby (bahasa Inggris: Rugby) merupakan sejenis permainan sepak bola tim yang dimainkan oleh dua tim.Setiap tim mencoba mencetak skor dengan cara menyepak, melontar, atau membawa bola sehingga mereka dapat menyepak untuk melepaskan gol lawan atau menyentuh di belakang garis lawan. Tim yang mencetak poin paling banyak menjadi pemenang.");
                break;

            case "Futsal":
                GetIcon.setImageResource(R.drawable.futsal);
                GetText.setText("Futsal adalah permainan bola yang dimainkan oleh dua tim, yang masing-masing beranggotakan lima orang. Tujuannya adalah memasukkan bola ke gawang lawan, dengan memanipulasi bola dengan kaki. Selain lima pemain utama, setiap regu juga diizinkan memiliki pemain cadangan. Tidak seperti permainan sepak bola dalam ruangan lainnya, lapangan futsal dibatasi garis, bukan net atau papan.");
                break;

            case "SepakTakraw":
                GetIcon.setImageResource(R.drawable.takraw);
                GetText.setText("Sepak takraw merupakan salah satu dari cabang olahraga permainan bola yang dimana merupakan kombinasi dari permainan sepak bola dengan bola voli dimainkan di lapang bulu tangkis, dan mempunyai peraturan dimana bola tidak boleh menyentuh tanah. Dalam permainan sepak takraw ini, pada umumya dimainkan oleh dua tim yang dimana masing-masing tim terdiri dari 3 orang pesepak.");
                break;
        }
    }
}