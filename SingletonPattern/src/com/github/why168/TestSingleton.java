package com.github.why168;

/**
 * com.github.why168.TestSingleton
 *
 * @author Edwin.Wu
 * @version 2016/12/16 19:03
 * @since JDK1.8
 */
public class TestSingleton {
    private String name = null;

    private TestSingleton() {
    }

    private static volatile TestSingleton instance = null;

    public static TestSingleton getInstance() {
        if (instance == null) {
            synchronized (TestSingleton.class) {
                if (instance == null) {
                    instance = new TestSingleton();
                }
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("the name is " + name);
    }
}
