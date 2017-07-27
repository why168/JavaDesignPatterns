package com.github.why168;

import com.github.why168.object.Adaptee;
import com.github.why168.object.Adapter;

/**
 * 适配模式
 * <p>
 * Target-对象
 * Client-请求者
 * Adaptee-被适配
 * Adapter-适配
 *
 * @author Edwin.Wu
 * @version 2016/12/22 15:46
 * @since JDK1.8
 */
public class Main {
    public static void main(String[] args) {
        object();
        classp();
    }

    /**
     * 对象适配器
     */
    private static void object() {
        Adapter adapter = new Adapter(new Adaptee());
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }

    /**
     * 类适配器
     */
    private static void classp() {
        com.github.why168.classp.Target adapter = new com.github.why168.classp.Adapter();
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
