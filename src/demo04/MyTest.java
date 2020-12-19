package demo04;

import demo03.Fu;

public interface MyTest{

    public abstract void method();
    //接口中不能使用final关键字来修饰方法
    default void methodA(){
        System.out.println("接口中的default方法");
    }
}
