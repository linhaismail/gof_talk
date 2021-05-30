package com.golf.talk.decorator.stucture;

/**
 * 具体的装饰对象，起到给 Component 添加职责的功能
 *
 * @author Vincent
 * @date 2021-05-29 17:34
 */
public class ConcreteDecorateB extends Decorate {

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    private void addBehavior() {
        System.out.println("ConcreteDecorateB 独有方法...");
    }
}
