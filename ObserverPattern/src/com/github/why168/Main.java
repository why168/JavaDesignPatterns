package com.github.why168;


/**
 * 观察者模式
 *
 * @author Edwin.Wu
 * @version 2016/12/17 19:48
 * @since JDK1.8
 */
public class Main {
    public static void main(String[] arg) {
        PushObservable pushObservable = PushObservable.getInstance();

        Observer a = new AObserver();
        Observer b = new BObserver();
        Observer c = new CObserver();

        pushObservable.addObserver(a);
        pushObservable.addObserver(b);
        pushObservable.addObserver(c);

        pushObservable.setData("注册中...服务服务器-模拟推送消息");


        pushObservable.deleteObserver(a);
        pushObservable.deleteObserver(b);
        pushObservable.deleteObserver(c);

        pushObservable.setData("解除...服务服务器-模拟推送消息");
    }
}
