package com.keding.designpatternsproject.observer;

/**
 * @author: skd
 * @date 2019-06-01
 * @Desc ObserverJavaMain
 */
public class ObserverJavaMain {
    public static void main(String[] args) {
        PostMan postMan = new PostMan();

        postMan.add(new Boy("小A"));
        postMan.add(new Boy("小B"));
        postMan.add(new Girl("小C"));

        postMan.notify("快递到了");
    }
}
