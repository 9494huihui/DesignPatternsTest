package com.liuyahui.easyFactory;

/**
 * @Description
 * @Author liuyahui
 * @Date 2018/9/26 11:00
 */
public class DivideOperation extends Operation {
    @Override
    public Double getResult(Double firstNumber, Double lastNumber) {
        return firstNumber / lastNumber;
    }
}
