package com.github.why168;

/**
 * example1----懒汉式--->在getInstance方法上加同步
 *
 * @author Edwin.Wu
 * @version 2016/12/16 17:53
 * @since JDK1.8
 */
public class Example1 {
    private static Example1 instance;

    private Example1() {
    }

    private static synchronized Example1 getInstance() {
        if (instance == null) {
            instance = new Example1();
        }
        return instance;
    }
}
