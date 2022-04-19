package com.example.third_recycleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    TextView addresses;

    public Holder(@NonNull View itemView) {
        super(itemView);
        addresses = itemView.findViewById(R.id.address);
    }
    public void bind(String adress){
    addresses.setText(adress);
    }
}
