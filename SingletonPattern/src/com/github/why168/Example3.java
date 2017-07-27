package com.github.why168;

/**
 * example2----懒汉式--->双重检查锁定
 *
 * @author Edwin.Wu
 * @version 2016/12/16 18:07
 * @since JDK1.8
 */
public class Example3 {
    private static Example3 instance;

    private Example3() {
    }

    public static Example3 getInstance() {
        if (instance == null) {
            synchronized (Example3.class) {
                if (instance == null) {
                    instance = new Example3();
                }
            }
        }
        return instance;
    }
}
