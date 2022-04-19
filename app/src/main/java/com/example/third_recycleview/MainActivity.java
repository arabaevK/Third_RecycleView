package com.example.third_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        Adapter adapter = new Adapter(address);
        recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setAdapter(adapter);

    }
    public void loadData(){
        address = new ArrayList<>();
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
        address.add("Ибраимов 103");
    }
}