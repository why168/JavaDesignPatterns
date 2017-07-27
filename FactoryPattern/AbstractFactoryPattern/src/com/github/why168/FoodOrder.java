package com.github.why168;

import com.github.why168.factory.AbsFactory;

/**
 * 订单
 *
 * @author Edwin.Wu
 * @version 2016/12/19 18:26
 * @since JDK1.8
 */
public class FoodOrder {
    AbsFactory mFactory;
    String name;

    public FoodOrder(AbsFactory mFactory, String name) {
        this.name = name;
        this.mFactory = mFactory;

        setFactory(mFactory);
    }

    public AbsFactory getFactory() {
        return mFactory;
    }

    public void setFactory(AbsFactory mFactory) {
        this.mFactory = mFactory;

        Food cooking = null;

        cooking = mFactory.CreateFoot(name);
        if (cooking != null) {
            cooking.prepare();
            cooking.buy();
            cooking.wash();
            cooking.quick();
            cooking.done();
        }

    }
}
