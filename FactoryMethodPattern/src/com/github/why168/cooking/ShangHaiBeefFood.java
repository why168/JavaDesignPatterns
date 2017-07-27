package com.github.why168.cooking;

import com.github.why168.Food;

/**
 * 上海的红烧牛肉
 *
 * @author Edwin.Wu
 * @version 2016/12/19 17:36
 * @since JDK1.8
 */
public class ShangHaiBeefFood extends Food {

    @Override
    public void prepare() {
        super.setName("ShangHai 红烧牛肉");
        System.out.println("prepare ---> "+super.getName());
    }
}
