package com.example.listnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvnuocuong;
    ArrayList <Nuocuong> arraynuoc;
    Nuocuongadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        adapter = new Nuocuongadapter(this, R.layout.dongnuocuong,arraynuoc);
        lvnuocuong.setAdapter(adapter);
    }
    private  void  Anhxa(){
        lvnuocuong = (ListView) findViewById(R.id.listnuoc);
        arraynuoc = new ArrayList<>();
        arraynuoc.add(new Nuocuong("Nước Cam","20.000VNĐ", R.drawable.cam));
        arraynuoc.add(new Nuocuong("Trà chanh","15.000VNĐ", R.drawable.trachanh));
        arraynuoc.add(new Nuocuong("Trà đào","30.000VNĐ", R.drawable.tradao));
        arraynuoc.add(new Nuocuong("Trà sữa","25.000VNĐ", R.drawable.trasua));
        arraynuoc.add(new Nuocuong("Coffee","25.000VNĐ", R.drawable.caphe));
        arraynuoc.add(new Nuocuong("Dưa Hấu ép","35.000VNĐ", R.drawable.duahau));


    }
}