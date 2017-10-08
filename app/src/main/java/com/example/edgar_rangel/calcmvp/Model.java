package com.example.edgar_rangel.calcmvp;

/**
 * Created by Edgar_Rangel on 10/5/2017.
 */

public class Model {
    private String message;

    public Model(){
        this.message = "Hello World";
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
