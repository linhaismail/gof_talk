package com.golf.talk.decorator.demo;

/**
 * 客户端代码
 *
 * @author Vincent
 * @date 2021-05-29 23:00
 */
public class DecorateClient {
    public static void main(String[] args) {
        Person person = new Person("小菜");

        LeatherShoes ls = new LeatherShoes();
        Tie tie = new Tie();
        TShirts ts = new TShirts();
        BigTrouser bt = new BigTrouser();

        ls.decorate(person);
        tie.decorate(ls);
        ts.decorate(tie);
        bt.decorate(ts);

        bt.show();
    }
}
