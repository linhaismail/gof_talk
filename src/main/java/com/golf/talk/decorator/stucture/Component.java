package com.golf.talk.decorator.stucture;

/**
 * 定义一个对象接口，可以给这个对象动态的添加职责。
 *
 * 如果只有一个 ConcreteComponent 类，就没有必要建立此抽象类了。
 *
 * @author Vincent
 * @date 2021-05-29 17:14
 */
public interface Component {
    void operation();
}
