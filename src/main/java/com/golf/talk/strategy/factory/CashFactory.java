package com.golf.talk.strategy.factory;

/**
 * 现金工厂
 *
 * @author Vincent
 * @date 2021-05-27 23:51
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type) {
        CashSuper cs;
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
                return null;
        }
        return cs;
    }
}
