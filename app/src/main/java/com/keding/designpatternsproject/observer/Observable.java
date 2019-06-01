package com.keding.designpatternsproject.observer;

/**
 * @author: skd
 * @date 2019-06-01
 * @Desc 被观察者
 */
public interface Observable {
    void add(Observer observer);

    void remove(Observer observer);

    void notify(String msg);

}
