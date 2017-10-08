package com.example.edgar_rangel.calcmvp;

import com.example.edgar_rangel.calcmvp.methods.Calculadora;

/**
 * Created by Edgar_Rangel on 10/5/2017.
 */

public interface Presenter {
    void setView(View view);
    void setCalcEval(String expression);
    Calculadora getEvalMethod();
}
