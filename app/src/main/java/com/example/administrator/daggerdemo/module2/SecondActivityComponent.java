package com.example.administrator.daggerdemo.module2;

import dagger.Component;

@Component(modules = SecondActivityModule.class)
public interface SecondActivityComponent {
    void inject(SecondActivity activity);
}
