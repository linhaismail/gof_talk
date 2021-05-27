package com.golf.talk.factory.simple;

/**
 * Division 除法类
 *
 * @author Vincent
 * @date 2021-05-23 22:25
 */
public class OperationDiv extends Operation{
    @Override
    double getResult() {
        return numberA / numberB;
    }
}
