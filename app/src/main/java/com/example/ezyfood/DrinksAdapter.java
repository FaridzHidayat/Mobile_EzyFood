package com.example.ezyfood;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DrinksAdapter extends  RecyclerView.Adapter<DrinksAdapter.Vholder>{

    Context konteks;
    ArrayList<Drink> menu;


    public DrinksAdapter(Context konteks,ArrayList<Drink> menu){
        this.konteks=konteks;
        this.menu = menu;
    }

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View liat = LayoutInflater.from(konteks).inflate(R.layout.item_drink,parent,false);
        return new Vholder(liat);
    }

    @Override
    public void onBindViewHolder(@NonNull Vholder holder, int position) {
        final Drink drink = menu.get(position);
        String harga = "Rp"+String.valueOf(drink.price);
        holder.image.setImageResource(menu.get(position).getPhoto());
        holder.tvname.setText(menu.get(position).getName());
        holder.tvprice.setText(harga);
        holder.item_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(konteks,OrderDrink.class);
                intent.putExtra("image",drink.getPhoto());
                intent.putExtra("name",drink.getName());
                intent.putExtra("price",drink.getPrice());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                konteks.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return menu.size();
    }


    class Vholder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView tvname;
        TextView tvprice;
        GridLayout item_drink;

        public Vholder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            tvname = itemView.findViewById(R.id.tvname);
            tvprice = itemView.findViewById(R.id.tvprice);
            item_drink = itemView.findViewById(R.id.item_drink);

        }


    }
}
