package com.walle.myapplication.simplefactory;

/**
 * Created by zhouyanbin on 2018/1/8.
 */

public abstract class Operation {
    private static final String TAG = "Operation";

    private double numA = 0;
    private double numB = 0;

    public double getNumA(){
        return numA;
    }
    public double getNumB(){
        return numB;
    }

    public void setNumA(double a){
        this.numA = a;
    }
    public void setNumB(double b){
        this.numB = b;
    }

    public abstract double getResult();
}
