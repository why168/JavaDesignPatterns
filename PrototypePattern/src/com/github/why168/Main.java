package com.github.why168;

import com.github.why168.deepCopy.ClassRoom;
import com.github.why168.deepCopy.DeepStudent;
import com.github.why168.shallowCopy.ShallStudent;

/**
 * 原型模型
 * http://www.cnblogs.com/itTeacher/archive/2012/12/02/2797857.html
 * http://www.imooc.com/article/9769
 * <p>
 * byte，short，int，long
 * float，double
 * char
 * boolean
 * <p>
 * String
 *
 * @author Edwin.Wu
 * @version 2016/12/21 00:04
 * @since JDK1.8
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        shallowCopy();
        deepCopy();
    }

    /**
     * 浅拷贝
     */
    private static void shallowCopy() {
        try {
            ShallStudent stu = new ShallStudent();
            stu.setId(1);
            stu.setAge(20);
            stu.setName("Edwin");

            //克隆
            ShallStudent cloneStu = (ShallStudent) stu.clone();

            //赋值
            ShallStudent attachStu = stu;

            System.out.println("stu---> hashCode = " + stu.hashCode());
            System.out.println("cloneStu---> hashCode = " + cloneStu.hashCode());
            System.out.println("attachStu---> hashCode = " + attachStu.hashCode());

            System.out.println("\n***************************************************\n");

            System.out.println("stu---> value = " + stu.toString());
            System.out.println("cloneStu---> value = " + cloneStu.toString());
            System.out.println("attachStu---> value = " + attachStu.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 深拷贝
     */
    private static void deepCopy() {
        try {
            DeepStudent stu = new DeepStudent();
            stu.setId(1);
            stu.setAge(20);
            stu.setName("Edwin");
            ClassRoom classRoom = new ClassRoom();
            classRoom.setId(201);
            classRoom.setHorizontal(2);
            classRoom.setVertical(5);
            stu.setClassRoom(classRoom);
            //克隆1
//            DeepStudent cloneStu = BeanUtil.cloneTo(stu);

            //克隆2
            DeepStudent cloneStu = (DeepStudent) stu.clone();

            //赋值
            DeepStudent attachStu = stu;

            System.out.println("stu---> hashCode = " + stu.hashCode());
            System.out.println("cloneStu---> hashCode = " + cloneStu.hashCode());
            System.out.println("attachStu---> hashCode = " + attachStu.hashCode());

            System.out.println("\n***************************************************\n");

            System.out.println("stu---> hashCode,ClassRoom =  " + stu.getClassRoom().hashCode());
            System.out.println("cloneStu---> hashCode,ClassRoom =  " + cloneStu.getClassRoom().hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
