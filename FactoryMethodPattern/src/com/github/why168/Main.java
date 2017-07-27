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
public class Main {
    public static void main(String[] args) {
        FoodOrder foodOrder;

        foodOrder = new BeiJingFoodOrder("红烧牛肉");
        foodOrder = new BeiJingFoodOrder("黄瓜炒鸡蛋");
        foodOrder = new BeiJingFoodOrder("蒜苔回锅肉");

        foodOrder = new SiChuanFoodOrder("红烧牛肉");
        foodOrder = new SiChuanFoodOrder("黄瓜炒鸡蛋");
        foodOrder = new SiChuanFoodOrder("蒜苔回锅肉");

        foodOrder = new ShangHaiFoodOrder("红烧牛肉");
        foodOrder = new ShangHaiFoodOrder("黄瓜炒鸡蛋");
        foodOrder = new ShangHaiFoodOrder("蒜苔回锅肉");
    }
}
