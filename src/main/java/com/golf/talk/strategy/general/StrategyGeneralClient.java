package com.golf.talk.strategy.general;

/**
 * 客户端
 *
 * @author Vincent
 * @date 2021-05-28 00:05
 */
public class StrategyGeneralClient {
    public static void main(String[] args) {
        CashContext cc = new CashContext("满300减100");
        double cash = cc.getResult(445);
        System.out.println("实付：" + cash);
    }
}
