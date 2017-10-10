package com.example.edgar_rangel.calcmvp;

/**
 * Created by Edgar_Rangel on 10/5/2017.
 */

public interface Presenter {
    void setView(View view);
    String cal(final String str);
}
