package com.github.why168.shallowCopy;

/**
 * 浅拷贝
 *
 * @author Edwin.Wu
 * @version 2016/12/21 14:13
 * @since JDK1.8
 */
public class ShallStudent implements Cloneable {
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ShallStudent clone() throws CloneNotSupportedException {
        try {
            return (ShallStudent) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "ShallStudent{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
