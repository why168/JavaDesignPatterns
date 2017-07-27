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
 * @version 2016/12/19 17:36
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
    public void buy() {
        System.out.println(name + " buy");
    }

    /**
     * 洗净食材
     */
    public void wash() {
        System.out.println(name + " wash");
    }

    /**
     * 快速翻炒
     */
    public void quick() {
        System.out.println(name + " quick");
    }

    /**
     * 出锅装盘
     */
    public void done() {
        System.out.println(name + " done \n");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
