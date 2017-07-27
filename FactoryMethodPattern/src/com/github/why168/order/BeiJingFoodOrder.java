package com.github.why168.order;

import com.github.why168.Food;
import com.github.why168.FoodOrder;
import com.github.why168.cooking.BeiJingBeefFood;
import com.github.why168.cooking.BeiJingCucumberFood;
import com.github.why168.cooking.BeiJingPigFood;

/**
 * 北京的订单
 *
 * @author Edwin.Wu
 * @version 2016/12/19 17:45
 * @since JDK1.8
 */
public class BeiJingFoodOrder extends FoodOrder {
    public BeiJingFoodOrder(String name) {
        super(name);
    }

    @Override
    public Food createFoot(String name) {
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
