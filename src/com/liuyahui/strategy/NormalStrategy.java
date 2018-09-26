package com.liuyahui.strategy;

/**
 * @Description
 * @Author liuyahui
 * @Date 2018/9/26 14:28
 */
public class NormalStrategy extends SaleStrategy {
    @Override
    public double getReduction(double price) {
        return price;
    }
}
