package com.github.why168;

/**
 * 简单工厂模式
 * <p>
 * 以餐厅举例
 * http://www.jikexueyuan.com/course/873.html
 * <p>
 * http://laughingchs.iteye.com/blog/1169986
 * <p>
 * http://blog.csdn.net/dandanzmc/article/details/8618059
 *
 * @author Edwin.Wu
 * @version 2016/12/18 01:35
 * @since JDK1.8
 */
public class Main$SimpleFactoryPattern {
    public static void main(String[] args) {
        FoodOrder restaurant = null;
        restaurant = new FoodOrder("红烧牛肉");
        restaurant = new FoodOrder("黄瓜炒鸡蛋");
        restaurant = new FoodOrder("蒜苔回锅肉");


    }
}
