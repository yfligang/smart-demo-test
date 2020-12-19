package demo05;
/*
   接口不能implements接口，类可以implements接口
   接口可以extends 多个接口
 */
public interface InterfaceMother extends InterfaceA,InterfaceB{
    //接口可以定义成员常量
    int num = 10;

    //接口中定义一个方法
    public void method(); //不是抽象方法

    public abstract void methodA();

    //Interface中的方法，只有default方法可以有方法体，不能用final修饰方法
    default void methodB() {
        System.out.println("我是接口中的默认方法");
    }

    void methodC(); //这个也是抽象方法

    abstract void methodD();


}
