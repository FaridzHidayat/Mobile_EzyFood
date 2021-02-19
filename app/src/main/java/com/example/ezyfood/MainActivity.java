package com.example.ezyfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void snacks(View view) {

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
                Intent myorder = new Intent(MainActivity.this,My_Order.class);
                startActivity(myorder);
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void topup(View view) {

    }

    public void drink(View view) {
        Intent menudrink = new Intent(MainActivity.this,MenuDrink.class);
        startActivity(menudrink);

    }

    public void food(View view) {
    }
}