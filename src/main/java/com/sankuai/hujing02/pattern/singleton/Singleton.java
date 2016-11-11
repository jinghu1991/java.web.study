package com.sankuai.hujing02.pattern.singleton;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/10/27 上午10:34
 * Description:
 */

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() { }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
