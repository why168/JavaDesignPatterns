package com.github.why168.factory;

import com.github.why168.Food;

/**
 * 抽象工厂
 *
 * @author Edwin.Wu
 * @version 2016/12/19 18:22
 * @since JDK1.8
 */
public interface AbsFactory {
    public Food CreateFoot(String name);
}
