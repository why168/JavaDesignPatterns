package com.github.why168;

/**
 * 装饰模式
 * <p>
 * 抽象构件角色（Project）：给出一个接口，以规范准备接收附加责任的对象
 * 具体构件角色（Employe）：定义一个将要接收附加责任的类
 * 装饰角色（Manager）：持有一个构件对象的实例，并定义一个与抽象构件接口一致的接口
 * 具体装饰角色（ManagerA、ManagerB）：负责给构件对象“贴上”附加的责任
 *
 * @author Edwin.Wu
 * @version 2016/12/25 15:16
 * @since JDK1.8
 */
public class Main$DecorativePattern {
    public static void main(String[] args) {
        Project employe = new Employe();        //代码工人
        Project managerA = new ManagerA(employe); //项目经理
        Project managerB = new ManagerB(employe); //项目经理
        //以经理的名义将编码完成，功劳都是经理的，实际编码的是工人
        managerA.doCoding();
        managerB.doCoding();
    }
}
