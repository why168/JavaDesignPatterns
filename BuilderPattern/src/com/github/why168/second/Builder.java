package com.github.why168.second;

/**
 * 抽象建造者
 *
 * @author Edwin.Wu
 * @version 2016/12/20 17:48
 * @since JDK1.8
 */
public interface Builder {
    public void buildPart1();

    public void buildPart2();

    /**
     * 检索结果
     *
     * @return Product
     */
    public Product retrieveResult();
}
