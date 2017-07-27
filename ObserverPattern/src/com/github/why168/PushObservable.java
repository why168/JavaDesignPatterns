package com.github.why168;

/**
 * 模拟消息推送的观察者
 * <p>
 * 根据服务器推送过来的消息进行不同的观察者
 *
 * @author Edwin.Wu
 * @version 2016/12/17 19:38
 * @since JDK1.8
 */
class PushObservable extends Observable {
    private Object data;

    private PushObservable() {
    }

    private final static class Instance {
        static final PushObservable instance = new PushObservable();
    }

    static PushObservable getInstance() {
        return Instance.instance;
    }

    void setData(Object data) {
        this.data = data;
        dataChange(data);
    }

    private void dataChange(Object data) {
        this.notifyObservers(data);
    }
}
