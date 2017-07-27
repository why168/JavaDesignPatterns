package com.github.why168.classp;

/**
 * @author Edwin.Wu
 * @version 2016/12/25 15:12
 * @since JDK1.8
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }
}