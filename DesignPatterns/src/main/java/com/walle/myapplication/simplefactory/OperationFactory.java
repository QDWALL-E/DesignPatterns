package com.walle.myapplication.simplefactory;

/**
 * Created by zhouyanbin on 2018/1/8.
 */

public class OperationFactory {
    public static Operation createOperation(String operator){
        Operation operation = null;
        if(operator.equals("+")){
            operation = new OperationAdd();
        }else if(operator.equals("-")){
            operation = new OperationSub();
        }else if(operator.equals("*")){
            operation = new OperationMul();
        }else if(operator.equals("/")){
            operation = new OperationDiv();
        }

        return operation;
    }
}
