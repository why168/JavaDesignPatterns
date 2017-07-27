package com.github.why168;

/**
 * com.github.why168.Example4-----懒汉式--->静态内部类
 * 推荐这种写法
 * effective java就是这么推荐。
 *
 * @author Edwin.Wu
 * @version 2016/12/16 18:14
 * @since JDK1.8
 */
public class Example4 {
    private static class Instance {
        private static final Example4 instance = new Example4();
    }

    private void Example4() {
    }

    public static final Example4 getInstance() {
        return Instance.instance;
    }
}