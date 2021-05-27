package com.golf.talk.strategy.general;

/**
 * 算法上下文
 *
 * @author Vincent
 * @date 2021-05-28 01:37
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(String type) {
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "打8折":
                cs = new CashDiscount("0.8");
                break;
            case "满300减100":
                cs = new CashRebate(300, 100);
                break;
            default:
                cs = null;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
