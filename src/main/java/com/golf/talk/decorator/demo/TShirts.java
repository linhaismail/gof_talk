package com.golf.talk.decorator.demo;

/**
 * ConcreteDecorate
 *
 * @author Vincent
 * @date 2021-05-29 22:38
 */
public class TShirts extends Finery{
    @Override
    public void show() {
        System.out.println("T恤");
        super.show();
    }
}
