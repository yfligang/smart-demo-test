package demo01.demo03;

public class DemoTest {
    public static void main(String[] args){
        /*
        Abstract类不能被实例
         */
        //Cat cat = new Cat();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        //子类可以调用父类中的方法
        dog.method();

    }
}
