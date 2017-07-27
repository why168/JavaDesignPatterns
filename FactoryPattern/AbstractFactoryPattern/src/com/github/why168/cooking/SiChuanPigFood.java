package com.github.why168.cooking;

import com.github.why168.Food;

/**
 * 四川的蒜苔回锅肉
 *
 * @author Edwin.Wu
 * @version 2016/12/19 17:36
 * @since JDK1.8
 */
public class SiChuanPigFood extends Food {
    @Override
    public void prepare() {
        super.setName("四川的蒜苔回锅肉");
        System.out.println("prepare ---> " + super.getName());
    }
}
