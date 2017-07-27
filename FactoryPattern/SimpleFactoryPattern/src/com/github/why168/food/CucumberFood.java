package com.github.why168.food;

import com.github.why168.Food;

/**
 * 黄瓜炒鸡蛋
 *
 * @author Edwin.Wu
 * @version 2016/12/18 22:13
 * @since JDK1.8
 */
public class CucumberFood extends Food {
    @Override
    public void prepare() {
        super.setName("黄瓜炒鸡蛋");
        System.out.println("prepare ---> "+super.getName());
    }
}
