package com.example.edgar_rangel.calcmvp;

/*Para importar las tareas asincronas y los metodos de las calculadoras*/

import android.widget.Button;

/**
 * Created by Edgar_Rangel on 10/5/2017.
 */

public interface View {
    /*Los metodos para la interfaz visual de la calculadora*/
    void getValues();

    void showResult(String result);

    void resetValues();

    void writeZero();
    void writeOne();
    void writeTwo();
    void writeThree();
    void writeFour();
    void writeFive();
    void writeSix();
    void writeSeven();
    void writeEight();
    void writeNine();

    void writeAdd();
    void writeSub();
    void writeMult();
    void writeDiv();
    void writeLParent();
    void writeRParent();
    void writemod();
    void writeSqrt();



}
