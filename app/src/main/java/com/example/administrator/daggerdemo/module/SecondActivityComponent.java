package com.example.administrator.daggerdemo.module;

import dagger.Component;

@Component(modules = SecondActivityModule.class)
public interface SecondActivityComponent {
    void inject(SecondActivity activity);
}
