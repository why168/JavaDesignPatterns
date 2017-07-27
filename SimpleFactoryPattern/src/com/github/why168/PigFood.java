package com.github.why168;

/**
 * 蒜苔回锅肉
 *
 * @author Edwin.Wu
 * @version 2016/12/18 22:20
 * @since JDK1.8
 */
public class PigFood extends Food {
    @Override
    public void prepare() {
        super.setName("蒜苔回锅肉");
        System.out.println("prepare ---> "+super.getName());
    }
}
