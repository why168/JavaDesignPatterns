package com.github.why168;

/**
 * 观察者
 *
 * @author Edwin.Wu
 * @version 2016/12/17 19:10
 * @since JDK1.8
 */
public interface Observer {
    /**
     * 更新
     *
     * @param o    被观察者对象
     * @param data 数据
     */
    void update(Observable o, Object... data);
}
