package com.golf.talk.strategy.factory;

/**
 * 客户端
 *
 * @author Vincent
 * @date 2021-05-28 00:05
 */
public class Client {
    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("满300减100");
        double cash = cashSuper.acceptCash(445);
        System.out.println("实付：" + cash);
    }
}
