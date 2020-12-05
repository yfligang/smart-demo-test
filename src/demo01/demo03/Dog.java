package demo01.demo03;

public class Dog extends Animal {
    /*
     子类继承抽象父类，如果子类是非抽象类，需要实现父类中全部的抽象方法
     如果子类是抽象类，不需要实现父类的抽象方法
     */
    public Dog(){
        System.out.println("子类的构造方法");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
