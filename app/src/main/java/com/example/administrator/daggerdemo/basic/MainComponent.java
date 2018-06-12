package com.example.administrator.daggerdemo.basic;


import dagger.Component;

@Component()
public interface MainComponent {
    void inject(MainActivity activity);
}
