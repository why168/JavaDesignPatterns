package com.github.why168.second;

/**
 * 产品
 *
 * @author Edwin.Wu
 * @version 2016/12/20 17:48
 * @since JDK1.8
 */
public class Product {
    /**
     * 定义一些关于产品的操作
     */
    private String part1;
    private String part2;

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                '}';
    }
}
