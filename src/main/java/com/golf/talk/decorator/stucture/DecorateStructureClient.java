package com.golf.talk.decorator.stucture;

/**
 * 客户端
 *
 * @author Vincent
 * @date 2021-05-29 17:50
 */
public class DecorateStructureClient {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecorateA decorateA = new ConcreteDecorateA();
        ConcreteDecorateB decorateB = new ConcreteDecorateB();

        decorateA.setComponent(component);
        decorateB.setComponent(decorateA);
        decorateB.operation();
    }
}
