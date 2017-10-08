package com.example.edgar_rangel.calcmvp.di;

import com.example.edgar_rangel.calcmvp.MainActivity;
import com.example.edgar_rangel.calcmvp.PresenterModule;

import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, PresenterModule.class})
public interface AppComponent {
    void inject(MainActivity target);
}
