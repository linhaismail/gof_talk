package com.golf.talk.factory.simple;

/**
 * Multiply 乘法类
 *
 * @author Vincent
 * @date 2021-05-23 22:04
 */
public class OperationMul extends Operation{
    @Override
    double getResult() {
        return numberA * numberB;
    }
}
