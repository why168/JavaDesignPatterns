package com.github.why168.factory;

import com.github.why168.Food;
import com.github.why168.cooking.BeiJingBeefFood;
import com.github.why168.cooking.BeiJingCucumberFood;
import com.github.why168.cooking.BeiJingPigFood;

/**
 * 具体的北京工厂
 *
 * @author Edwin.Wu
 * @version 2016/12/19 18:25
 * @since JDK1.8
 */
public class BeiJingFactory implements AbsFactory {
    @Override
    public Food CreateFoot(String name) {
        Food cooking = null;
        if ("红烧牛肉".equals(name)) {
            cooking = new BeiJingBeefFood();
        } else if ("黄瓜炒鸡蛋".equals(name)) {
            cooking = new BeiJingCucumberFood();
        } else if ("蒜苔回锅肉".equals(name)) {
            cooking = new BeiJingPigFood();
        }
        return cooking;
    }
}
