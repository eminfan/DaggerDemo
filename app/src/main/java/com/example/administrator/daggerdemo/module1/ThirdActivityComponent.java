package com.example.administrator.daggerdemo.module1;

import dagger.Component;

@Component(modules = ThirdActivityModule.class)
public interface ThirdActivityComponent {
    void inject(ThirdActivity activity);
}
