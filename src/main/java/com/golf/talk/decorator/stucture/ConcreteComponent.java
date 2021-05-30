package com.golf.talk.decorator.stucture;

/**
 * 定义了一个具体的对象，也可以给这个对象添加一些职责
 *
 * @author Vincent
 * @date 2021-05-29 17:16
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作...");
    }
}
