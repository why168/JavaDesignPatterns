package com.github.why168;

/**
 * 烹饪厨房
 * <p>
 * 步骤：
 * 1.购买食材
 * 2.洗净食材
 * 3.快速翻炒
 * 4.出锅装盘
 *
 * @author Edwin.Wu
 * @version 2016/12/18 21:48
 * @since JDK1.8
 */
public abstract class Food {
    /**
     * 菜名
     */
    private String name;

    public abstract void prepare();

    /**
     * 购买食材
     */
    void buy() {
        System.out.println(name + " buy");
    }

    /**
     * 洗净食材
     */
    void wash() {
        System.out.println(name + " wash");
    }

    /**
     * 快速翻炒
     */
    void quick() {
        System.out.println(name + " quick");
    }

    /**
     * 出锅装盘
     */
    void done() {
        System.out.println(name + " done \n");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
