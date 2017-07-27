package com.github.why168;

import com.github.why168.food.BeefFood;
import com.github.why168.food.CucumberFood;
import com.github.why168.food.PigFood;

/**
 * 餐厅订单
 *
 * @author Edwin.Wu
 * @version 2016/12/18 23:10
 * @since JDK1.8
 */
class FoodOrder {

    FoodOrder(String name) {
        Food cooking = null;

        if ("红烧牛肉".equals(name)) {
            cooking = new BeefFood();
        } else if ("黄瓜炒鸡蛋".equals(name)) {
            cooking = new CucumberFood();
        } else if ("蒜苔回锅肉".equals(name)) {
            cooking = new PigFood();
        } else {
            throw new RuntimeException("非法参数：" + name);
        }
        cooking.prepare();
        cooking.buy();
        cooking.wash();
        cooking.quick();
        cooking.done();
    }
}
