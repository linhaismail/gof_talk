package com.golf.talk.strategy.general;

/**
 * 打折
 *
 * @author Vincent
 * @date 2021-05-27 23:36
 */
public class CashDiscount implements CashSuper {

    private double rate;

    public CashDiscount(String rate) {
        this.rate = Double.parseDouble(rate);
    }
    @Override
    public double acceptCash(double money) {
        return money * rate;
    }
}
