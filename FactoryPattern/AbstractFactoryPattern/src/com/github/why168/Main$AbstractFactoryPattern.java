package com.github.why168;

import com.github.why168.factory.AbsFactory;
import com.github.why168.factory.BeiJingFactory;
import com.github.why168.factory.ShangHaiFactory;
import com.github.why168.factory.SiChuanFactory;

/**
 * 抽象工厂模式
 *
 * @author Edwin.Wu
 * @version 2016/12/18 23:27
 * @since JDK1.8
 */
public class Main$AbstractFactoryPattern {
    public static void main(String[] args) {
        FoodOrder foodOrder;
        foodOrder = new FoodOrder(new BeiJingFactory(), "红烧牛肉");
        foodOrder = new FoodOrder(new SiChuanFactory(), "红烧牛肉");
        foodOrder = new FoodOrder(new ShangHaiFactory(), "红烧牛肉");
    }
}
