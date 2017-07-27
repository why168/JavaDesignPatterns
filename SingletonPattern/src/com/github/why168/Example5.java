package com.github.why168;

import java.util.HashMap;
import java.util.Map;

/**
 * com.github.why168.Example5
 *
 * @author Edwin.Wu
 * @version 2016/12/16 18:38
 * @since JDK1.8
 */
public class Example5 {
    private static Map<String, Example5> map = new HashMap<String, Example5>();

    static {
        Example5 single = new Example5();
        map.put(single.getClass().getName(), single);
    }

    //保护的默认构造子
    protected Example5() {
    }

    //静态工厂方法,返还此类惟一的实例
    public static Example5 getInstance(String name) {
        if (name == null) {
            name = Example5.class.getName();
            System.out.println("name == null" + "--->name=" + name);
        }
        if (map.get(name) == null) {
            try {
                map.put(name, (Example5) Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }

    //一个示意性的商业方法
    public String about() {
        return "Hello, I am RegSingleton.";
    }

    public static void main(String[] args) {
        Example5 single3 = Example5.getInstance(null);
        System.out.println(single3.about());
    }
}
