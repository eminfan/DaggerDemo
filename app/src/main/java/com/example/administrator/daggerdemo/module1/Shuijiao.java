package com.example.administrator.daggerdemo.module1;

import javax.inject.Inject;

public class Shuijiao {
    String type = "羊肉";

    @Inject
    public Shuijiao(String type) {
        this.type = type;
    }
}
