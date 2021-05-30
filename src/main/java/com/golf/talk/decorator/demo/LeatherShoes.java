package com.golf.talk.decorator.demo;

/**
 * ConcreteDecorate
 *
 * @author Vincent
 * @date 2021-05-29 22:55
 */
public class LeatherShoes extends Finery{
    @Override
    public void show() {
        System.out.println("大皮鞋");
        super.show();
    }
}
