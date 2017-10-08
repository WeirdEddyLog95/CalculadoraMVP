package com.example.edgar_rangel.calcmvp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Edgar_Rangel on 10/5/2017.
 */
@Module
public class PresenterModule {
    @Provides
    public Presenter providePresenter(Model model){
        return new PresenterImpl(model);
    }
    @Provides
    public Model provideModel(){
        return new Model();
    }
}
