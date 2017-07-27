package com.github.why168;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 *
 * @author Edwin.Wu
 * @version 2016/12/17 19:10
 * @since JDK1.8
 */
 class Observable {
    /**
     * 保存注册的观察者对象
     */
    private List<Observer> obs;

     Observable() {
        obs = new ArrayList<>();
    }

    /**
     * 注册观察者对象
     *
     * @param o 观察者对象
     */
     synchronized void addObserver(Observer o) {
        if (o == null) {
            throw new NullPointerException("observer == null");
        }
        synchronized (this) {
            if (!obs.contains(o))
                obs.add(o);
        }

    }

    /**
     * 删除观察者对象
     *
     * @param o 观察者对象
     */
     synchronized void deleteObserver(Observer o) {
        obs.remove(o);
    }


    /**
     * 通知观察者
     *
     * @param data 数据
     */
     void notifyObservers(Object data) {
        if (obs != null) {
            for (Observer observer : obs) {
                observer.update(this, data);
            }
        }
    }

}
