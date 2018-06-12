package com.example.administrator.daggerdemo.module1;

import dagger.Module;
import dagger.Provides;

@Module
public class ThirdActivityModule {
    String brand;
    String type;

    public ThirdActivityModule(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    @Provides
    public CokeCola offerCola() {
        return new CokeCola(brand);
    }

    @Provides
    public Shuijiao offerShuijiao() {
        return new Shuijiao(type);
    }
}
