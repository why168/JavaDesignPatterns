package com.github.why168.factory;

import com.github.why168.Food;
import com.github.why168.cooking.SiChuanBeefFood;
import com.github.why168.cooking.SiChuanCucumberFood;
import com.github.why168.cooking.SiChuanPigFood;

/**
 * 具体的四川工厂
 *
 * @author Edwin.Wu
 * @version 2016/12/19 18:24
 * @since JDK1.8
 */
public class SiChuanFactory implements AbsFactory {
    @Override
    public Food CreateFoot(String name) {
        Food cooking = null;
        if ("红烧牛肉".equals(name)) {
            cooking = new SiChuanBeefFood();
        } else if ("黄瓜炒鸡蛋".equals(name)) {
            cooking = new SiChuanCucumberFood();
        } else if ("蒜苔回锅肉".equals(name)) {
            cooking = new SiChuanPigFood();
        }
        return cooking;
    }
}
