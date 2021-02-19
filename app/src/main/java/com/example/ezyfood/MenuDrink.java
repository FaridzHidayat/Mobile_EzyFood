package com.example.ezyfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MenuDrink extends AppCompatActivity {

    ArrayList<Drink> menu;
    RecyclerView REVdrink;
    DrinksAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_drink);
        menu = new ArrayList<>();
        REVdrink = findViewById(R.id.REVdrink);
        REVdrink.setLayoutManager(new GridLayoutManager(this,2));



        Drink minuman1 = new Drink();
        minuman1.name = "Air Mineral";
        minuman1.price = 7000;
        minuman1.photo = R.drawable.airmineral;

        Drink minuman2 = new Drink();
        minuman2.name = "Fanta";
        minuman2.price = 8000;
        minuman2.photo = R.drawable.fanta;

        Drink minuman3 = new Drink();
        minuman3.name = "Sprite";
        minuman3.price = 10000;
        minuman3.photo = R.drawable.sprite;

        Drink minuman4 = new Drink();
        minuman4.name = "Coca-Cola";
        minuman4.price = 20000;
        minuman4.photo = R.drawable.cocacola;

        Drink minuman5 = new Drink();
        minuman5.name = "Ice Tea";
        minuman5.price = 5000;
        minuman5.photo = R.drawable.ice_tea;

        Drink minuman6 = new Drink();
        minuman6.name = "Orange Juice";
        minuman6.price = 15000;
        minuman6.photo = R.drawable.orange_jus;

        Drink minuman7 = new Drink();
        minuman7.name = "Macchiatto";
        minuman7.price = 28000;
        minuman7.photo = R.drawable.machiatto_latte;

        Drink minuman8 = new Drink();
        minuman8.name = "Carramel latte";
        minuman8.price = 27000;
        minuman8.photo = R.drawable.carramel_latte;

        menu.add(minuman1);
        menu.add(minuman2);
        menu.add(minuman3);
        menu.add(minuman4);
        menu.add(minuman5);
        menu.add(minuman6);
        menu.add(minuman7);
        menu.add(minuman8);

        adapter = new DrinksAdapter(this,menu);
        REVdrink.setAdapter(adapter);
    }



    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.myorder,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){

            case R.id.order1:
                Intent myorder = new Intent(MenuDrink.this,My_Order.class);
                startActivity(myorder);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}