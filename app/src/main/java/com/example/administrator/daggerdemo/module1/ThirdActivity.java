package com.example.administrator.daggerdemo.module1;

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
public class ThirdActivity extends AppCompatActivity {

    Button btnEat;

    @Inject
    CokeCola cokeCola;
    @Inject
    Shuijiao shuijiao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEat = findViewById(R.id.eat);
        btnEat.setText("吃喝");
        DaggerThirdActivityComponent
                .builder()
                .thirdActivityModule(new ThirdActivityModule("可口可乐", "羊肉"))
                .build()
                .inject(this);

        btnEat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "可乐品牌是" + cokeCola.brand + ",水饺馅是" + shuijiao.type, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
