package com.github.why168.deepCopy;

import java.io.Serializable;

/**
 * @author Edwin.Wu
 * @version 2016/12/21 14:38
 * @since JDK1.8
 */
public class ClassRoom implements Serializable,Cloneable{
    private static final long serialVersionUID = 1L;
    private int id;
    private int horizontal;
    private int vertical;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public void setVertical(int vertical) {
        this.vertical = vertical;
    }

    @Override
    public ClassRoom clone() {
        try {
            return (ClassRoom)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
