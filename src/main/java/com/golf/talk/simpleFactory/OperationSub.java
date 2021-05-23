package com.golf.talk.simpleFactory;

/**
 * Subtraction 减法类
 *
 * @author Vincent
 * @date 2021-05-23 21:27
 */
public class OperationSub extends Operation{
    @Override
    double getResult() {
        return numberA - numberB;
    }
}
