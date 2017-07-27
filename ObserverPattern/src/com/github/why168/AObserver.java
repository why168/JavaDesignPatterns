package com.github.why168;

/**
 * A观察者-实现类
 *
 * @author Edwin.Wu
 * @version 2016/12/17 23:30
 * @since JDK1.8
 */
public class AObserver implements Observer {
    @Override
    public void update(Observable o, Object... data) {
        System.out.println("【A】Observer Push--->  data = " + data[0]);
    }
}
