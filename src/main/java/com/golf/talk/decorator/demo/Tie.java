package com.golf.talk.decorator.demo;

/**
 * ConcreteDecorate
 *
 * @author Vincent
 * @date 2021-05-29 22:56
 */
public class Tie extends Finery{
    @Override
    public void show() {
        System.out.println("领带");
        super.show();
    }
}
