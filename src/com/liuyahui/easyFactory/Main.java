package com.liuyahui.easyFactory;

import java.util.Scanner;

/**
 * @Description
 * @Author liuyahui
 * @Date 2018/9/26 11:11
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        Double firstNumber = scanner.nextDouble();
        System.out.println("请输入运算符：");
        String operator = scanner.next();
        System.out.println("请输入第二个数字：");
        Double lastNumber = scanner.nextDouble();
        scanner.close();

        Operation operation = OperationFactory.createOperation(operator);
        Double result = operation.getResult(firstNumber, lastNumber);
        System.out.println("运算结果是：" + result);
    }
}
