package com.example.edgar_rangel.calcmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;


public class MainActivity extends AppCompatActivity implements View {
    //Binding de los botones con ButterKnife
    @BindView(R.id.btnOne) Button btnone;
    @BindView(R.id.btnTwo) Button btntwo;
    @BindView(R.id.btnThree) Button btnthree;
    @BindView(R.id.btnFour) Button btnfour;
    @BindView(R.id.btnFive) Button btnfive;
    @BindView(R.id.btnSix) Button btnsix;
    @BindView(R.id.btnSev) Button btnsev;
    @BindView(R.id.btnEight) Button btneight;
    @BindView(R.id.btnNine) Button btnnine;
    @BindView(R.id.btnZero) Button btnzero;
    @BindView(R.id.btnAdd) Button btnadd;
    @BindView(R.id.btnSub) Button btnsub;
    @BindView(R.id.btnMult) Button btnmult;
    @BindView(R.id.btnDiv) Button btndiv;
    @BindView(R.id.btnLeftParent) Button btnleftP;
    @BindView(R.id.btnRightParent) Button btnrightP;
    @BindView(R.id.btnMod) Button btnmod;
    @BindView(R.id.btnSquare) Button btnsqrt;
    @BindView(R.id.etNum2) EditText inputvalue;
    @BindView(R.id.tvResult) TextView result;
    String expression;

    @Inject
    Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Area to Make the Binding
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume(){
        super.onResume();
        presenter.setView(this);
    }

    @Override
    protected void onStop(){
        super.onStop();
        presenter.setView(null);
    }

    @Optional
    @OnClick({R.id.btnOne, R.id.btnTwo, R.id.btnThree, R.id.btnFour, R.id.btnFive, R.id.btnSix
    , R.id.btnSev, R.id.btnEight, R.id.btnNine, R.id.btnZero, R.id.btnLeftParent, R.id.btnRightParent})
    @Override
    public void writeValues(Button button) {
        switch(button.getId()) {
            case R.id.btnOne:
                inputvalue.setText(inputvalue.getText() + "1");
                break;
            case R.id.btnTwo:
                inputvalue.setText(inputvalue.getText() + "2");
                break;
            case R.id.btnThree:
                inputvalue.setText(inputvalue.getText() + "3");
                break;
            case R.id.btnFour:
                inputvalue.setText(inputvalue.getText() + "4");
                break;
            case R.id.btnFive:
                inputvalue.setText(inputvalue.getText() + "5");
                break;
            case R.id.btnSix:
                inputvalue.setText(inputvalue.getText() + "6");
                break;
            case R.id.btnSev:
                inputvalue.setText(inputvalue.getText() + "7");
                break;
            case R.id.btnEight:
                inputvalue.setText(inputvalue.getText() + "8");
                break;
            case R.id.btnNine:
                inputvalue.setText(inputvalue.getText() + "9");
                break;
            case R.id.btnZero:
                inputvalue.setText(inputvalue.getText() + "0");
                break;
            case R.id.btnLeftParent:
                inputvalue.setText(inputvalue.getText() + "(");
                break;
            case R.id.btnRightParent:
                inputvalue.setText(inputvalue.getText() + ")");
                break;
        }
        }
    @Optional
    @OnClick({R.id.btnAdd, R.id.btnSub, R.id.btnDiv, R.id.btnMult, R.id.btnMod, R.id.btnSquare})
    @Override
    public void writeAlgorithSigns(Button button) {
        switch(button.getId()) {
            case R.id.btnAdd:
                inputvalue.setText(inputvalue.getText() + "+");
                break;
            case R.id.btnSub:
                inputvalue.setText(inputvalue.getText() + "-");
                break;
            case R.id.btnDiv:
                inputvalue.setText(inputvalue.getText() + "/");
                break;
            case R.id.btnMult:
                inputvalue.setText(inputvalue.getText() + "*");
                break;
            case R.id.btnMod:
                inputvalue.setText(inputvalue.getText() + "%");
                break;
            case R.id.btnSquare:
                inputvalue.setText(inputvalue.getText() + "√");
                break;
        }
    }

    @OnClick(R.id.btnEqual)
    @Override
    public void getValues() {
        try{
            expression = inputvalue.getText().toString();
            presenter.setCalcEval(expression);
        } catch (Exception e){
            Toast.makeText(this, "Introduce los datos apropiadamente dentro de la calculadora", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void showResult(String resolve) {
        resolve = expression;
        result.setText(resolve);
    }

    @OnClick(R.id.btnCancel)
    @Override
    public void resetValues() {
        inputvalue.setText("");
        result.setText("Resultado");
    }
}



