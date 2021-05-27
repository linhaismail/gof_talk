package com.golf.talk.strategy.factory;

/**
 * 正常收费
 *
 * @author Vincent
 * @date 2021-05-27 23:33
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
