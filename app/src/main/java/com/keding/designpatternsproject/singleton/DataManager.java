package com.keding.designpatternsproject.singleton;

/**
 * @author: skd
 * @date 2019-06-01
 * @Desc DataManager
 */
public class DataManager {
    private static volatile DataManager sInstance;

    public DataManager() {
        //可以做些初始化相关的东西
    }

    public DataManager getInstance() {
        if (sInstance == null) {
            synchronized (DataManager.class) {
                if (sInstance == null) {
                    sInstance = new DataManager();
                }
            }
        }
        return sInstance;
    }
}
