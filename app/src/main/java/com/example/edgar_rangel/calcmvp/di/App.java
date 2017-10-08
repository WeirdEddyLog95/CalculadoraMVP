package com.example.edgar_rangel.calcmvp.di;

import android.app.Application;

import com.example.edgar_rangel.calcmvp.PresenterModule;

public class App extends Application {
    private AppComponent appComponent;
    @Override
    public void onCreate(){
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .presenterModule(new PresenterModule())
                .build();
    }

    public AppComponent getComponent(){
        return appComponent;
    }
}
