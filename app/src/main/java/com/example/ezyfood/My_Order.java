package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class My_Order extends AppCompatActivity {

    ArrayList<my_order_list> menu1;
    RecyclerView REV_myorderdrink;
    MyOrderAdapter adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__order);
        menu1 = new ArrayList<>();
        REV_myorderdrink=findViewById(R.id.REV_myorderdrink);
        REV_myorderdrink.setLayoutManager(new LinearLayoutManager(this));

        my_order_list list1 = new my_order_list();
        list1.Name="Coca-Cola";
        list1.price=7000;
        list1.qty=2;

        menu1.add(list1);
        adapter1 = new MyOrderAdapter(this,menu1);
        REV_myorderdrink.setAdapter(adapter1);
    }
}