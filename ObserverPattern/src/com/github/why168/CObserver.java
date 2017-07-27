package com.github.why168;

/**
 * C观察者-实现类
 *
 * @author Edwin.Wu
 * @version 2016/12/17 23:31
 * @since JDK1.8
 */
public class CObserver implements Observer {
    @Override
    public void update(Observable o, Object... data) {
        System.out.println("【C】Observer Push--->  data = " + data[0]);
    }
}
