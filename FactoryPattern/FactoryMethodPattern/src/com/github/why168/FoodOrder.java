package com.github.why168;

/**
 * 餐厅订单
 *
 * @author Edwin.Wu
 * @version 2016/12/19 17:38
 * @since JDK1.8
 */
public abstract class FoodOrder {

    public FoodOrder(String name) {
        Food cooking = null;

        cooking = createFoot(name);

        cooking.prepare();
        cooking.buy();
        cooking.wash();
        cooking.quick();
        cooking.done();
    }

    public abstract Food createFoot(String name);
}
