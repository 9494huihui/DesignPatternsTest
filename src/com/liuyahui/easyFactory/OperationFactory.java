package com.liuyahui.easyFactory;

/**
 * @Description
 * @Author liuyahui
 * @Date 2018/9/26 11:08
 */
public class OperationFactory {
    public static Operation createOperation(String operation) {
        switch (operation) {
            case "+" : return new AddOperation();
            case "-" : return new SubtractOperation();
            case "*" : return new MultiplyOperation();
            case "/" : return new DivideOperation();
            default: return new Operation();
        }
    }
}
