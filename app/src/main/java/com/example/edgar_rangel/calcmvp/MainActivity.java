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
    PresenterImpl implement;

    @Inject
    Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        //Area to Make the Binding
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnZero)
    @Override
    public void writeZero() {
        inputvalue.setText(inputvalue.getText()+ "0");
    }

    @OnClick(R.id.btnOne)
    @Override
    public void writeOne() {
        inputvalue.setText(inputvalue.getText()+ "1");
    }

    @OnClick(R.id.btnTwo)
    @Override
    public void writeTwo() {
        inputvalue.setText(inputvalue.getText()+ "2");
    }

    @OnClick(R.id.btnThree)
    @Override
    public void writeThree() {
        inputvalue.setText(inputvalue.getText()+ "3");
    }

    @OnClick(R.id.btnFour)
    @Override
    public void writeFour() {
        inputvalue.setText(inputvalue.getText()+ "4");
    }

    @OnClick(R.id.btnFive)
    @Override
    public void writeFive() {
        inputvalue.setText(inputvalue.getText()+ "5");
    }

    @OnClick(R.id.btnSix)
    @Override
    public void writeSix() {
        inputvalue.setText(inputvalue.getText()+ "6");
    }

    @OnClick(R.id.btnSev)
    @Override
    public void writeSeven() {
        inputvalue.setText(inputvalue.getText()+ "7");
    }

    @OnClick(R.id.btnEight)
    @Override
    public void writeEight() {
        inputvalue.setText(inputvalue.getText()+ "8");
    }

    @OnClick(R.id.btnNine)
    @Override
    public void writeNine() {
        inputvalue.setText(inputvalue.getText()+ "9");
    }

    @OnClick(R.id.btnAdd)
    @Override
    public void writeAdd() {
        inputvalue.setText(inputvalue.getText()+ "+");
    }

    @OnClick(R.id.btnSub)
    @Override
    public void writeSub() {
        inputvalue.setText(inputvalue.getText()+ "-");
    }

    @OnClick(R.id.btnMult)
    @Override
    public void writeMult() {
        inputvalue.setText(inputvalue.getText()+ "*");
    }

    @OnClick(R.id.btnDiv)
    @Override
    public void writeDiv() {
        inputvalue.setText(inputvalue.getText()+ "/");
    }

    @OnClick(R.id.btnLeftParent)
    @Override
    public void writeLParent() {
        inputvalue.setText(inputvalue.getText()+ "(");
    }

    @OnClick(R.id.btnRightParent)
    @Override
    public void writeRParent() {
        inputvalue.setText(inputvalue.getText()+ ")");
    }

    @OnClick(R.id.btnMod)
    @Override
    public void writemod() {
        inputvalue.setText(inputvalue.getText()+ "%");
    }

    @OnClick(R.id.btnSquare)
    @Override
    public void writeSqrt() {
        inputvalue.setText(inputvalue.getText()+ "sqrt");
    }

    @OnClick(R.id.btnEqual)
    @Override
    public void getValues() {
        try{
            //get the expression set in edittext
            expression = inputvalue.getText().toString();
            //start to calculate
            String res = presenter.cal(expression);
            result.setText(res);

            } catch (Exception e) {
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



