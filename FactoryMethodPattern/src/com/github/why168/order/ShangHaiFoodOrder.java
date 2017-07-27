package com.github.why168.order;

import com.github.why168.Food;
import com.github.why168.FoodOrder;
import com.github.why168.cooking.ShangHaiBeefFood;
import com.github.why168.cooking.ShangHaiCucumberFood;
import com.github.why168.cooking.ShangHaiPigFood;

/**
 * 上海的订单
 *
 * @author Edwin.Wu
 * @version 2016/12/19 17:46
 * @since JDK1.8
 */
public class ShangHaiFoodOrder extends FoodOrder {
   public ShangHaiFoodOrder(String name) {
        super(name);
    }

    @Override
    public Food createFoot(String name) {
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
