package com.github.why168.object;

/**
 * @author Edwin.Wu
 * @version 2016/12/25 15:09
 * @since JDK1.8
 */
public class Adapter implements Target {

    private Adaptee mAdaptee;

    public Adapter(Adaptee adaptee) {
        mAdaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        mAdaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }
}