package com.walle.myapplication.simplefactory;

/**
 * Created by zhouyanbin on 2018/1/8.
 */

public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result;
        result = getNumA() * getNumB();
        return result;
    }
}
