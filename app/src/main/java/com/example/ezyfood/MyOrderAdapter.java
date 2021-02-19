package com.example.ezyfood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyOrderAdapter extends  RecyclerView.Adapter<MyOrderAdapter.Vholder>{

    Context konteks1;
    ArrayList<my_order_list> menu1;


    public MyOrderAdapter(Context konteks1,ArrayList<my_order_list> menu1){
        this.konteks1=konteks1;
        this.menu1 = menu1;
    }

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View liat1 = LayoutInflater.from(konteks1).inflate(R.layout.my_order_recycle,parent,false);
        return new Vholder(liat1);
    }

    @Override
    public void onBindViewHolder(@NonNull Vholder holder, int position) {
        final my_order_list myorder = menu1.get(position);
        String harga1 = String.valueOf(myorder.price);
        String qty1 = String.valueOf(myorder.qty);
        holder.myorder_name.setText(menu1.get(position).getName());
        holder.myorder_price.setText(harga1);
        holder.myorder_qty.setText(qty1);

    }

    @Override
    public int getItemCount() {
        return menu1.size();
    }


    class Vholder extends RecyclerView.ViewHolder {
        ;
        TextView myorder_name;
        TextView myorder_price,myorder_qty;
        LinearLayout linear1;

        public Vholder(@NonNull View itemView) {
            super(itemView);

            myorder_name = itemView.findViewById(R.id.myorder_name);
            myorder_price = itemView.findViewById(R.id.myorder_price);
            myorder_qty = itemView.findViewById(R.id.myorder_qty);
            linear1 = itemView.findViewById(R.id.linear1);

        }


    }
}

