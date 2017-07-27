package com.github.why168;

import com.github.why168.first.Student;
import com.github.why168.second.Builder;
import com.github.why168.second.ConcreteBuilder;
import com.github.why168.second.Director;
import com.github.why168.second.Product;

/**
 * 建造者模式
 * <p>
 * http://www.cnblogs.com/java-my-life/archive/2012/04/07/2433939.html
 *
 * @author Edwin.Wu
 * @version 2016/12/20 16:46
 * @since JDK1.8
 */

public class Main {
    public static void main(String[] args) {
        //TODO 第一种 简单
        Student student =
                new Student.Builder()
                        .setId(1)
                        .setAge(20)
                        .setName("Edwin")
                        .setClassroom("计算机一班")
                        .build();
        System.out.println("Student = [" + student + "]");


        //TODO 第二种 复杂
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();

        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}