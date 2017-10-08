package com.example.edgar_rangel.calcmvp;

import com.example.edgar_rangel.calcmvp.methods.Calculadora;

/**
 * Created by Edgar_Rangel on 10/5/2017.
 */

public class PresenterImpl implements Presenter {
    private Model model;
    private View view;
    private Calculadora calculadora;

    public PresenterImpl(Model model){
        this.model = model;
    }

    @Override
    public void setCalcEval(String expression) {
        calculadora.eval(expression);
    }

    @Override
    public void setView(View view) {
        this.view = view;
    }
}
