package com.github.why168;

import com.github.why168.order.BeiJingFoodOrder;
import com.github.why168.order.ShangHaiFoodOrder;
import com.github.why168.order.SiChuanFoodOrder;

/**
 * 工厂方法模式
 *
 * @author Edwin.Wu
 * @version 2016/12/18 23:26
 * @since JDK1.8
 */
public class Main$FactoryMethodPattern {

    public static void main(String[] args) {

        new BeiJingFoodOrder("红烧牛肉");
        new BeiJingFoodOrder("黄瓜炒鸡蛋");
        new BeiJingFoodOrder("蒜苔回锅肉");

        new SiChuanFoodOrder("红烧牛肉");
        new SiChuanFoodOrder("黄瓜炒鸡蛋");
        new SiChuanFoodOrder("蒜苔回锅肉");

        new ShangHaiFoodOrder("红烧牛肉");
        new ShangHaiFoodOrder("黄瓜炒鸡蛋");
        new ShangHaiFoodOrder("蒜苔回锅肉");
    }
}
