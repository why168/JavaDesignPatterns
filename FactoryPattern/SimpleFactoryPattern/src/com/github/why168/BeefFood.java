package com.github.why168;

/**
 * 红烧牛肉
 *
 * @author Edwin.Wu
 * @version 2016/12/18 22:16
 * @since JDK1.8
 */
public class BeefFood extends Food {

    @Override
    public void prepare() {
        super.setName("红烧牛肉");
        System.out.println("prepare ---> "+super.getName());
    }
}
