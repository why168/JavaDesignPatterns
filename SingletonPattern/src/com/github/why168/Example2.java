package com.github.why168;

/**
 * example2----饿汉式--->自身线程安全
 *
 * @author Edwin.Wu
 * @version 2016/12/16 17:57
 * @since JDK1.8
 */
public class Example2 {
    private static Example2 instance = new Example2();

    private Example2() {
    }

    public static Example2 getInstance() {
        return instance;
    }
}
