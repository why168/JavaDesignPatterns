package com.github.why168.deepCopy;

import java.io.Serializable;

/**
 * 深拷贝
 *
 * @author Edwin.Wu
 * @version 2016/12/21 14:13
 * @since JDK1.8
 */
public class DeepStudent implements Serializable, Cloneable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int age;
    private String name;
    private ClassRoom classRoom;

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

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public Object clone() {
        try {
            DeepStudent ds = (DeepStudent) super.clone();
            ds.classRoom = (ClassRoom) this.classRoom.clone();
            return ds;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
