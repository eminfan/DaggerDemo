package com.example.administrator.daggerdemo.module2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.daggerdemo.R;

import javax.inject.Inject;

/**
 * @author fan
 */
public class SecondActivity extends AppCompatActivity {

    Button btnEat;

    @Inject
    Cola cola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEat = findViewById(R.id.eat);
        btnEat.setText("喝");
        DaggerSecondActivityComponent.builder().build().inject(this);
        btnEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "可乐品牌是" + cola.brand, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
