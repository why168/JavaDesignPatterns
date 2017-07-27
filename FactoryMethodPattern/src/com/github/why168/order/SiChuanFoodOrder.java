package com.github.why168.order;

import com.github.why168.Food;
import com.github.why168.FoodOrder;
import com.github.why168.cooking.SiChuanBeefFood;
import com.github.why168.cooking.SiChuanCucumberFood;
import com.github.why168.cooking.SiChuanPigFood;

/**
 * 四川的订单
 *
 * @author Edwin.Wu
 * @version 2016/12/19 17:46
 * @since JDK1.8
 */
public class SiChuanFoodOrder extends FoodOrder {
    public SiChuanFoodOrder(String name) {
        super(name);
    }

    @Override
    public Food createFoot(String name) {
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
