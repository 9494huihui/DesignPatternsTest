package com.liuyahui.strategy;

/**
 * @Description
 * @Author liuyahui
 * @Date 2018/9/26 14:29
 */
public class Strategy {
    private SaleStrategy saleStrategy;

    public Strategy(String type) {
        switch (type) {
            case "正常" : this.saleStrategy = new NormalStrategy();break;
            case "打八折" : this.saleStrategy = new DiscountStrategy(0.8);break;
            case "打五折" : this.saleStrategy = new DiscountStrategy(0.5);break;
            case "满300减30" : this.saleStrategy = new MinusStrategy(300, 30);break;
            case "满200减10" : this.saleStrategy = new MinusStrategy(200, 10);break;
        }
    }

    public double getLastPrice(double price) {
        return saleStrategy.getReduction(price);
    }
}
