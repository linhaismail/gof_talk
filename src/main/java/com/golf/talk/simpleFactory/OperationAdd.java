package com.golf.talk.simpleFactory;

/**
 * 运算类：加
 *
 * @author Vincent
 * @date 2021-05-23 21:10
 */
public class OperationAdd extends Operation{

    @Override
    double getResult() {
        return numberA + numberB;
    }
}
