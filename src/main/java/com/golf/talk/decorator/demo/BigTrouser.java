package com.golf.talk.decorator.demo;

/**
 * ConcreteDecorate
 *
 * @author Vincent
 * @date 2021-05-29 22:48
 */
public class BigTrouser extends Finery {
    @Override
    public void show() {
        System.out.println("大裤子");
        super.show();
    }
}
