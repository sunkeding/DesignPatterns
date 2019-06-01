package com.keding.designpatternsproject.observer;

import java.util.Vector;

/**
 * @author: skd
 * @date 2019-06-01
 * @Desc 快递员
 */
public class PostMan implements Observable {
//    Vector中的操作是线程安全的
    Vector<Observer> list = new Vector();

    @Override
    public void add(Observer observer) {
        list.addElement(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.removeElement(observer);
    }

    @Override
    public void notify(String msg) {
        for (Observer observer : list) {
            observer.update(msg);
        }
    }
}
