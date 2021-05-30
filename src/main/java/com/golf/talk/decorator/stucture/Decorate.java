package com.golf.talk.decorator.stucture;

/**
 * 装饰抽象类，继承了 Component 类，从外类来扩展 Component 类的功能，
 * 但对于 Component 来说，是无需知道 Decorate 的存在的。
 *
 * 如果只有一个 ConcreteDecorate 类，就没有必要建立此抽象类了
 *
 * @author Vincent
 * @date 2021-05-29 17:18
 */
public abstract class Decorate implements Component {

    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
