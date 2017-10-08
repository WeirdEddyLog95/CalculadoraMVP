package com.example.edgar_rangel.calcmvp;

/*Para importar las tareas asincronas y los metodos de las calculadoras*/

import android.widget.Button;

/**
 * Created by Edgar_Rangel on 10/5/2017.
 */

public interface View {
    /*Los metodos para la interfaz visual de la calculadora*/
    void writeValues(Button button);

    void writeAlgorithSigns(Button button);

    void getValues();

    void showResult(String result);

    void resetValues();
}
