package com.example.administrator.daggerdemo.module1;

import javax.inject.Inject;

public class CokeCola {
    String brand = "";

    @Inject
    CokeCola(String brand) {
        this.brand = brand;
    }
}
