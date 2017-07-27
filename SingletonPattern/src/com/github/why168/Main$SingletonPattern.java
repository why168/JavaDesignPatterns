package com.github.why168;

/**
 * 单例模式
 *
 * @author Edwin.Wu
 * @version 2016/12/16 16:03
 * @since JDK1.8
 */
public class Main$SingletonPattern {

    public static void main(String[] args) {
        // write your code here
        TestSingleton ts1 = TestSingleton.getInstance();
        ts1.setName("jason");
        TestSingleton ts2 = TestSingleton.getInstance();
        ts2.setName("0539");

        ts1.printInfo();
        ts2.printInfo();

        if (ts1 == ts2) {
            System.out.println("创建的是同一个实例");
        } else {
            System.out.println("创建的不是同一个实例");
        }

    }

}
