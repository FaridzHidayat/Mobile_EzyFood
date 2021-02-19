package com.example.ezyfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class OrderDrink extends AppCompatActivity {
    ImageView image;
    TextView name,price,qty;
    ImageView plus,minus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_drink);

        image=(ImageView)findViewById(R.id.image_order);
        name=(TextView)findViewById(R.id.tvname_order);
        price=(TextView)findViewById(R.id.tvprice_order);
        plus=(ImageView) findViewById(R.id.plus);
        minus=(ImageView) findViewById(R.id.minus);
        qty=(TextView)findViewById(R.id.quantity);

        final Integer[] qty1 = {0};
        qty.setText(""+ qty1[0]);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty1[0]++;
                qty.setText(""+ qty1[0]);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qty1[0] !=0){
                    qty1[0]--;
                    qty.setText(""+ qty1[0]);
                }
            }
        });

        image.setImageResource(getIntent().getIntExtra("image",0));
        name.setText(getIntent().getStringExtra("name"));
        Integer harga1 = getIntent().getIntExtra("price",1);
        price.setText(String.valueOf(harga1));



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
                Intent myorder = new Intent(OrderDrink.this,My_Order.class);
                startActivity(myorder);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void orderlagi(View view) {
        Intent orderlagi = new Intent(OrderDrink.this,MenuDrink.class);
        startActivity(orderlagi);
    }



    public void ok(View view) {

    }



}