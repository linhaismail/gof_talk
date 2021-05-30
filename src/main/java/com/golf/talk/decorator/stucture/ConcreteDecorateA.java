package com.golf.talk.decorator.stucture;

/**
 * 具体的装饰对象，起到给 Component  添加职责的功能
 *
 * @author Vincent
 * @date 2021-05-29 17:24
 */
public class ConcreteDecorateA extends Decorate{

    /**
     * 本类独有的功能，区别于 ConcreteDecorateB
     */
    private String addState;

    @Override
    public void operation() {
        super.operation();
        addState = "ConcreteDecorateA 独有功能...";
        System.out.println(addState);
    }
}
