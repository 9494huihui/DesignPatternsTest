package com.liuyahui.strategy;

/**
 * @Description
 * @Author liuyahui
 * @Date 2018/9/26 14:25
 */
public class MinusStrategy extends SaleStrategy {
    private double fullPrice;
    private double minusPrice;

    public MinusStrategy(double fullPrice, double minusPrice) {
        this.fullPrice = fullPrice;
        this.minusPrice = minusPrice;
    }

    @Override
    public double getReduction(double price) {
        if (price > fullPrice) {
            return price - minusPrice;
        }
        return price;
    }
}
