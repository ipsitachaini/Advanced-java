package com.demo.bean;

import java.io.Serializable;

public class TableBean implements Serializable {

    private int number;

    public TableBean(){}

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public String getTable(){

        String result = "";

        for(int i=1;i<=10;i++){
            result += number + " x " + i + " = " + (number*i) + "<br>";
        }

        return result;
    }
}