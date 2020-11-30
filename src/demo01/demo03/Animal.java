package demo01.demo03;

public abstract class Animal {
    //父类抽象方法
    public Animal(){
        System.out.println("抽象父类的构造方法");
    }
    //创建一个抽象方法 需要void 没有返回.如果有子类继承，需要子类实现父类中的所有抽象方法
    public abstract void eat();
    public abstract void sleep();
    //抽象类中可以创建普通方法
    public void method(){
        System.out.println("父类的方法");
    }
}
