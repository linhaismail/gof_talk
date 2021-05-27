package com.golf.talk.strategy.factory;

/**
 * 返现
 *
 * @author Vincent
 * @date 2021-05-27 23:42
 */
public class CashRebate implements CashSuper {

    private int condition;

    private int rebate;

    public CashRebate(int condition, int rebate) {
        this.condition = condition;
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= condition) {
            result -= Math.floor(money / condition) * rebate;
        }
        return result;
    }
}
