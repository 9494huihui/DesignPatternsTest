package com.liuyahui;

import com.liuyahui.easyFactory.Operation;
import com.liuyahui.easyFactory.OperationFactory;
import com.liuyahui.strategy.Strategy;

import java.util.Scanner;

/**
 * @Description
 * @Author liuyahui
 * @Date 2018/9/26 15:37
 */
public class Main {

    public static void main(String[] args) {
        //简单工厂模式
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入第一个数字：");
//        Double firstNumber = scanner.nextDouble();
//        System.out.println("请输入运算符：");
//        String operator = scanner.next();
//        System.out.println("请输入第二个数字：");
//        Double lastNumber = scanner.nextDouble();
//        scanner.close();
//
//        Operation operation = OperationFactory.createOperation(operator);
//        Double result = operation.getResult(firstNumber, lastNumber);
//        System.out.println("运算结果是：" + result);

        //策略模式
        Strategy strategy = new Strategy("正常");
        double result = strategy.getLastPrice(500);
        System.out.println("正常价格：" + result);

        strategy = new Strategy("打八折");
        result = strategy.getLastPrice(result);
        System.out.println("打折后价格：" + result);

        strategy = new Strategy("满300减30");
        result = strategy.getLastPrice(result);
        System.out.println("满减后价格：" + result);
    }

}