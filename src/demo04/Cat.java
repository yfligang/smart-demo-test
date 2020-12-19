package demo04;

public class Cat extends Animal {

    //子类重载方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
