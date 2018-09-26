package com.liuyahui.strategy;

/**
 * @Description
 * @Author liuyahui
 * @Date 2018/9/26 14:24
 */
public class DiscountStrategy extends SaleStrategy {
    private double discount;

    public DiscountStrategy(double discount) {
        this.discount = discount;
    }

    @Override
    public double getReduction(double price) {
        return price * discount;
    }
}
