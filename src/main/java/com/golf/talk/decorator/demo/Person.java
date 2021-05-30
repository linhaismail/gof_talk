package com.golf.talk.decorator.demo;

/**
 * ConcreteComponent
 *
 * @author Vincent
 * @date 2021-05-29 22:15
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}