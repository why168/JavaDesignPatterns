package com.github.why168.factory;

import com.github.why168.Food;
import com.github.why168.cooking.ShangHaiBeefFood;
import com.github.why168.cooking.ShangHaiCucumberFood;
import com.github.why168.cooking.ShangHaiPigFood;

/**
 * 具体的上海工厂
 *
 * @author Edwin.Wu
 * @version 2016/12/19 18:24
 * @since JDK1.8
 */
public class ShangHaiFactory implements AbsFactory {
    @Override
    public Food CreateFoot(String name) {
        Food cooking = null;
        if ("红烧牛肉".equals(name)) {
            cooking = new ShangHaiBeefFood();
        } else if ("黄瓜炒鸡蛋".equals(name)) {
            cooking = new ShangHaiCucumberFood();
        } else if ("蒜苔回锅肉".equals(name)) {
            cooking = new ShangHaiPigFood();
        }
        return cooking;
    }
}
