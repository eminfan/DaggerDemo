package com.example.administrator.daggerdemo.module2;

import dagger.Module;
import dagger.Provides;

@Module
public class SecondActivityModule {

    @Provides
    Cola offerCola() {
        return new Cola();
    }
}
