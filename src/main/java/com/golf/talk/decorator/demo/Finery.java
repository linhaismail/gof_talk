package com.golf.talk.decorator.demo;

/**
 * 服饰类 Decorate
 *
 * @author Vincent
 * @date 2021-05-29 22:32
 */
public class Finery extends Person{

    private Person component;

    protected void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
