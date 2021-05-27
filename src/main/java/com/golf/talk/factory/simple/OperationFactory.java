package com.golf.talk.factory.simple;

/**
 * 运算方法工厂
 *
 * @author Vincent
 * @date 2021-05-23 19:59
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation;
        switch (operate) {
            case "+": {
                operation = new OperationAdd();
                break;
            }
            case "-": {
                operation = new OperationSub();
                break;
            }
            case "*": {
                operation = new OperationMul();
                break;
            }
            case "/": {
                operation = new OperationDiv();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + operate);
        }
        return operation;
    }
}
