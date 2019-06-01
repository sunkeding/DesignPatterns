package com.keding.designpatternsproject.observer;

/**
 * @author: skd
 * @date 2019-06-01
 * @Desc Boy
 */
public class Boy implements Observer {
     String name;

    public Boy(String name) {
        this.name=name;
    }

    @Override
    public void update(String msg) {
        System.out.printf("%s,叫%s的男生收到了快递%n", msg, name);
    }
}
