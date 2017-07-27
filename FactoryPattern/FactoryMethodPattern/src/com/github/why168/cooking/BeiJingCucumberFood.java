package com.github.why168.cooking;

import com.github.why168.Food;

/**
 * 北京的黄瓜炒鸡蛋
 *
 * @author Edwin.Wu
 * @version 2016/12/19 17:36
 * @since JDK1.8
 */
public class BeiJingCucumberFood extends Food {
    @Override
    public void prepare() {
        super.setName("北京的黄瓜炒鸡蛋");
        System.out.println("prepare ---> "+super.getName());
    }
}
