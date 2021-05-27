package com.golf.talk.factory.simple;

/**
 * 运算类
 *
 * @author Vincent
 * @date 2021-05-23 21:05
 */
public abstract class Operation {

    public double numberA;

    public double numberB;

    public Operation() {
        numberA = 0;
        numberB = 0;
    }

    abstract double getResult();
}
