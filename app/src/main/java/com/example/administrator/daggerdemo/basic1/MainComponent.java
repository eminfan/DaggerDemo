package com.example.administrator.daggerdemo.basic1;


import dagger.Component;

@Component()
public interface MainComponent {
    void inject(MainActivity activity);
}
