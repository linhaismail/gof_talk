package com.golf.talk.simpleFactory;

/**
 * 计算器
 *
 * @author Vincent
 * @date 2021-05-23 21:30
 */
public class Calculator {

    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("+");
        operation.numberA = 4.524;
        operation.numberB = 2.343;
        double result = operation.getResult();
        System.out.println(">>>:" + result);

        Operation operation1 = OperationFactory.createOperation("*");
        double result1 = operation1.getResult();
        System.out.println(">>>:" + result1);

        Operation operation2 = OperationFactory.createOperation("/");
        operation2.numberA = 34;
        operation2.numberB = 53;
        double result2 = operation2.getResult();
        System.out.println(">>>:" + result2);
    }
}
