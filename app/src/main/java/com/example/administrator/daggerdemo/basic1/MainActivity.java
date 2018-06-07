package com.example.administrator.daggerdemo.basic1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.daggerdemo.R;
import com.example.administrator.daggerdemo.module2.SecondActivity;

import javax.inject.Inject;

/**
 * @author fan
 */
public class MainActivity extends AppCompatActivity {

    Button btnEat;

    @Inject
    Baozi baozi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEat = findViewById(R.id.eat);
        Button next = findViewById(R.id.btn_next_home);
        DaggerMainComponent.builder().build().inject(this);

        btnEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "包子馅是"+baozi.type, Toast.LENGTH_SHORT).show();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}
