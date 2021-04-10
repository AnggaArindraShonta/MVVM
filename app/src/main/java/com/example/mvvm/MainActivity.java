package com.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.mvvm.view.KelilingActivity;
import com.example.mvvm.view.LuasActivity;

public class MainActivity extends AppCompatActivity {

    Button luas, keliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        luas = findViewById(R.id.luas);
        keliling = findViewById(R.id.keliling);

        luas.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LuasActivity.class);
            startActivity(intent);
        });

        keliling.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, KelilingActivity.class);
            startActivity(intent);
        });

    }
}